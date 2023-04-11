/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un programa que dado un número determine si es par o impar.
        Scanner read = new Scanner(System.in);
        
        int num = read.nextInt();
        
        if (num%2==0){
            System.out.println("El numero "+ num +" es par");
//        }else {
            System.out.println("El numero " + num + "no es par");
        }
        
    }
    
}
