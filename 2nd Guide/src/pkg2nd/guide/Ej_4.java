/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_4 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner read = new Scanner(System.in);
        String frase=read.nextLine().toUpperCase();
 
        if (frase.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
;
}
