/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_8_bis {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño en numeros");
        int tamanio=leer.nextInt();
        
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio; j++) {
                
                if (i>0 && i<tamanio-1 && j>0 && j<tamanio-1) {
                    System.out.print(" "+" ");
                    
                }else{
                    System.out.print("*"+" ");
                }
               
            }
             System.out.println("");
          
        }
       
    }
}

