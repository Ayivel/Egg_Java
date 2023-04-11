/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3rd_guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_2 {
    public static void main(String[] args) {
        /*
        Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
        las personas ingresadas por teclado e indique si son mayores o menores de edad. 
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando 
        personas y frenar cuando el usuario ingrese la palabra “No”.

        Datos: Ingresar el nombre y edad de N personas
        Resultado: El programa debera determinar si son mayores o menores de edad y preguntar despues de cada
        dato si quiere seguir. Frenar con la palabra No.
        
        */
        String validator="";
        Scanner read = new Scanner(System.in);
        String name="";
        int age=0;
        do {
            System.out.println("Ingrese el nombre de la persona");
            name=read.next();
            age=read.nextInt();
            data(name,age);
            System.out.println("Quiere seguir con el programa?");
            validator=read.next().toUpperCase();
            
        } while (validator.equals("NO")==false);
        
        
    }
    public static boolean isOlder(int age){
        return age>18;
    }
    public static void data(String name,int age){
        if (isOlder(age)==false) {
            System.out.println(name+" tiene "+age + " anios, entonces es menor");
        }else{
        System.out.println(name+" tiene "+age + " anios, entonces es mayor");
        }
        
    }
}
   





