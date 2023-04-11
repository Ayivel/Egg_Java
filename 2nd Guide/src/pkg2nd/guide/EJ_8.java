/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 
4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class EJ_8 {

    public static void main(String[] args) {
        System.out.println("Por favor, ingrese el tamanio del cuadrado. Tiene que ser un numero par");
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();

        if (size % 2 != 0) {
            do {
                System.out.println("Por favor ingrese un tamanio par");
                size = read.nextInt();
            } while (size % 2 != 0);
        }

        //Hasta ahora lo que se hace es ingresar el size del cuadrado
        System.out.println("El cuadrado de tamanio " + size + " es");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > 0 && i < size - 1 && j > 0 && j < size - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println("");
        }

    }
}

//Para i <- 1 Hasta  num Con Paso 1 Hacer
//		Para j <- 1 Hasta num Con Paso 1 Hacer
//			si (i = 1) o (i = num) Entonces
//				Escribir sin saltar  "*" 
//			sino
//				si j = 1 o j = (num - 1) Entonces
//					Escribir sin saltar   "*" 
//				FinSi
//				escribir sin saltar " "
//				
//			FinSi
//			
//		Fin Para
//		Escribir " "
//	Fin Para
