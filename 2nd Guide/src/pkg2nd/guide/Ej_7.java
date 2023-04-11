/*
 * 
 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String codigo;
        int cont = 0, cont2 = 0;
        System.out.println("Ingrese el codigo");
        codigo = read.nextLine().toUpperCase();
        while (!codigo.equals("&&&&&")) {
            if (codigo.length() == 5) {
                if (codigo.substring(0, 1).equals("X") && codigo.substring(4, 5).equals("O")) {
                    cont = cont + 1;
                } else {
                    cont2 = cont2 + 1;
                }
            } else {
                cont2 = cont2 + 1;
            }
            System.out.println("Ingrese el codigo");
            codigo = read.nextLine().toUpperCase();
        }
        System.out.println("La cantidad de codigos correctos son " + cont
                + " mientras que la cantidad de incorrectos es " + cont2);

    }

}
