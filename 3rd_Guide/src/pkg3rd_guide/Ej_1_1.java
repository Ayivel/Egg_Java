package pkg3rd_guide;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ariel
 */
public class Ej_1_1 {

    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, 
        multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben 
        devolver sus resultados para imprimirlos en el main. */
        double num1;
        double num2;
        System.out.println("Ingrese 2 numeros");
        Scanner read = new Scanner(System.in);
        num1 = read.nextDouble();
        num2 = read.nextDouble();
        String exit = "N";
        do {
            System.out.println("Menu");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion");
            int input = read.nextInt();

            switch (input) {
                case 1 -> {System.out.println("La suma de " + num1 + " y " + num2 + " es " + sumar(num1, num2));
                break;
                }
                case 2 -> {System.out.println("La resta de " + num1 + " y " + num2 + " es " + restar(num1, num2));
                break;
                }
                case 3 -> {System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es " + multiply(num1, num2));
                break;
                }
                case 4 -> {System.out.println("La division de " + num1 + " y " + num2 + " es " + divide(num1, num2));
                break;
                }
                case 5 -> {
                    System.out.println("Esta seguro que desea salir? S/N");
                    exit = read.next().toUpperCase();
                
                }

            }
         
        } while (exit.equals("S")==false);

    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
