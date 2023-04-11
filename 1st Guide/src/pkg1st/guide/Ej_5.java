/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1st.guide;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author ariel
 */
public class Ej_5 {
    public static void main(String[] args) {
//      Escribir un programa
//      que lea un número entero por teclado y muestre 
//      por pantalla el doble, el triple y la raíz cuadrada de ese número.   
        Scanner read = new Scanner(System.in);
        double num;
        System.out.println("Ingrese un numero entero");
        num=read.nextInt();
        
        System.out.println("El doble de " + num + " es " + num*2);
        System.out.println("El tiple de " + num + " es " + num*3);
        System.out.println("La raiz cuadrada de  " + num + " es " + Math.sqrt(num));
        
    }
;
}

