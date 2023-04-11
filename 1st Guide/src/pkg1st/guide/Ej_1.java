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
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner read;
        read=new Scanner(System.in);
        int num1,num2,sum;
        
        System.out.println("Ingrese dos numeros");
        num1=read.nextInt(); num2=read.nextInt();
        sum=num1+num2;
        System.out.println("La suma de " + num1+ " y "+ num2 +" es " + sum);
        
    }
    
}
