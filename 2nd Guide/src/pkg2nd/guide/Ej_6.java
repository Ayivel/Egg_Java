/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el 
resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_6 {

    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros positivos");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int num2 = read.nextInt();
        int result;
        int opcion;
        String salir = "N";

        if (num <= 0 || num2 <= 0) {
            do {
                System.out.println("Por favor ingrese valores positivos");
                num = read.nextInt();
                num2 = read.nextInt();
            } while (num <= 0 || num2 <= 0);
            System.out.println("Excelente!, ahora elija que es lo que quiere hacer con estos valores");
        }

        do {
            System.out.println("Menú");
            System.out.println("1.Sumar ");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Eliga una opción");

            opcion = read.nextInt();

            switch (opcion) {
                case 1 -> {
                    result = num + num2;
                    System.out.println("El resultado es " + result);
                    System.out.println("=======================");
                    break;
                }
                case 2 -> {
                    result = num - num2;
                    System.out.println("El resultado es " + result);
                    System.out.println("=======================");
                    break;
                }
                case 3 -> {
                    result = num * num2;
                    System.out.println("El resultado es " + result);
                    System.out.println("=======================");
                    break;
                }
                case 4 -> {
                    result = num / num2;
                    System.out.println("El resultado es " + result);
                    System.out.println("=======================");
                    break;
                }
                case 5 -> {
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    System.out.println("=======================");
                    salir = read.next().toUpperCase();

                    break;
                }

            }

        } while (!salir.equals("S"));

    }
;
}
