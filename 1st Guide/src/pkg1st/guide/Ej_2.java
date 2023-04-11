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
public class Ej_2 {
  //  Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
   public static void main(String[] args){
       String name;
       Scanner read;
       read= new Scanner(System.in);
       System.out.println("Por favor ingrese su nombre");
       name=read.next();
       System.out.println("Bienvenido "+ name + " :)");
   };

}
