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
public class Ej_4 {
    public static void main(String[] args){
//    Dada una cantidad de grados 
//            centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//            La fórmula correspondiente es: F = 32 + (9 * C / 5).
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados que quiere transformar a fahrenheit");
        double C=read.nextDouble();
        double F= 32+(9*C/5);
        System.out.println("Temperatura en grados " + C + "C° Temperatura en Fahrenheit " + F+"F");
       
    
    };
}
