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
public class Ej_3 {

    public static void main(String[] args) {
////        Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
//        Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla 
//       que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
//       Nota: investigar la función Lenght() en Java.
        System.out.println("Ingrese una frase de 8 caracteres");
        Scanner read = new Scanner(System.in);
        String frase;
        frase = read.nextLine();
        if (frase.length()==8) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
;
}
