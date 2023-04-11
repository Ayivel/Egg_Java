/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1st.guide;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class Ej_3 {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
    public static void main(String[] args){
        String frase;
        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Por favor, ingrese una frase");
        frase=read.nextLine();
        
        System.out.println("Frase ingresada en mayusculas "+ frase.toUpperCase() + " Frase en minusculas: " + frase.toLowerCase());
        
    };
    
}
