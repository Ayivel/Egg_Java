/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.

 */
package pkg2nd.guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ej_5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor limite");
        Scanner read = new Scanner(System.in);
        
        int num = read.nextInt();
        int limit;
        int i =0;
        limit=num;
        if (num>0) {
            do{
                System.out.println("Ahora Ingrese otro numero");
                num = read.nextInt();
                
                i=i+num;
                
            }while(limit>i);
        }
        
    }
;
}
