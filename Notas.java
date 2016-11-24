/**
 * @author Erick Lopez
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Noviembre 2016
 */

import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Notas{
    public int [] notas;
    
    public void pedirNotas(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salir=true;  
                
        do{
             System.out.println("Cuantos Notas deseas ingresar?");
             try{
                  notas = new int[Integer.parseInt(br.readLine())];                       
             }catch(IOException e){
                 
             }catch(NumberFormatException e){
                  System.out.println("El Caracter Que Ingresaste No Es Numero, Intenta De Nuevo.");
                  salir=false;   
             }
        }while(salir!=true); 
        
        for(int i=0;i<notas.length;i++){
             System.out.println("Ingrese Nota: "+ (i+1));
             try{
                 notas[i]=Integer.parseInt(br.readLine());
             }catch(IOException e){
                 System.out.print(" >>Ingrese solo números enteros<<< ");
             }
        }  
        
        

    }
    
    public void buscarNotas(){
        double promedio = 0;
        double max = notas[0];
        double min = notas[0];
        int sumaNotas = 0;
        
        for(int i=0; i<notas.length;i++){
            sumaNotas = sumaNotas + notas[i];
        }
        promedio = sumaNotas / notas.length;
        System.out.println("El promedio en notas es: "+ promedio);
        
        for(int i=0;i<notas.length;i++){
            if(notas[i]>max){
                max=notas[i];
            }
            if(notas[i]<min){
                min=notas[i];
            }
        }
        System.out.println("La nota mayor es: "+ max);
        System.out.println("La nota menor es: "+ min);
    }
    
    public static void main(String [] args){
         Notas Objeto = new Notas();
                
         Objeto.pedirNotas();
         Objeto.buscarNotas();
    }
}
