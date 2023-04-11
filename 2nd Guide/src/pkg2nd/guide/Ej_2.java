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
public class Ej_2 {
    public static void main(String[] args) {
      /*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
        Nota: investigar la función equals() en Java.
        */
        System.out.println("Por favor ingrese una frase");
        Scanner read = new Scanner(System.in);
        String frase;
        frase = read.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        
        }else{
            System.out.println("Incorrecto");
        }
       
            
        }
    
    }


