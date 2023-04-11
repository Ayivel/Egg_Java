/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4th_guide;

import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0, b;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuat = 0;
        int cinco = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese largo de vector");
        a = leer.nextInt();
        int vect[] = new int[a];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < vect.length; i++) {
            String cad;
            cad = valueOf(vect[i]);
            b = cad.length();
            switch (b) {
                case 1:
                    uno = 1 + uno;
                    break;
                case 2:
                    dos = 1 + dos;
                    break;
                case 3:
                    tres = tres + 1;
                    break;
                case 4:
                    cuat++;
                    break;
                case 5:
                    cinco++;
                    break;
            }

        }
        System.out.println("Lacantidad de numeros con 1 cifra es:" + uno);
        System.out.println("Lacantidad de numeros con 2 cifra es:" + dos);
        System.out.println("Lacantidad de numeros con 3 cifra es:" + tres);
        System.out.println("Lacantidad de numeros con 4 cifra es:" + cuat);
        System.out.println("Lacantidad de numeros con 5 cifra es:" + cinco);
    }
    }
    

