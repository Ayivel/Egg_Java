
package pkg3rd_guide;

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
        String frase;
        System.out.println("Por favor ingrese una frase");
        Scanner read = new Scanner(System.in);
        frase = read.nextLine();
        
        System.out.println("La nueva frase es " + readFrase(frase));
    }

    public static String readFrase(String frase) {
        String guardar="";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case "a":
                   guardar=guardar.concat("@");
                    break;
                case "e":
                    guardar=guardar.concat("#");
                    break;
                case "i":
                   guardar=guardar.concat("$");
                    break;

                case "o":
                    guardar=guardar.concat("%");
                    break;
                   
                case "u":
                    guardar=guardar.concat("*");
                    break;
                         
                default:
                    guardar=guardar.concat(frase.substring(i,i+1));
                    break;
            }

        }
        
        return guardar;
    }
}
