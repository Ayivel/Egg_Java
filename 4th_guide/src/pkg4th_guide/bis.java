/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4th_guide;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class bis {
    public static void main(String[] args) {
        int[][] matriz= new int[3][3];
        int validar=0;
        System.out.println("Ingrese las compononentes de la matriz 3x3. Los valores se deben encontrar entre 1 y 9");

        Scanner read = new Scanner(System.in);
        int componente;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                do {
                    System.out.println("ingrese un numero en la posicion " + i +" , " + j);
                    componente = read.nextInt();
                } while (componente < 1 || componente > 10);
                matriz[i][j] = componente;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ "+ matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < matriz.length; i++) { 
            validar = matriz[i][0]+validar; 
        }
          int cond1=sumafilas(matriz,validar);
          int cond2=sumacolumnas(matriz,validar);
          int cond3=sumadiagonal(matriz,validar);
        if (cond1==3 && cond2==3 && cond3==2){
            System.out.println(" la matriz es magica");
        }else{System.out.println("La matriz no es magica");
    }
    }
public static int sumafilas(int matriz[][],int validar){
    int sumafila=0;
    int cont=0;
    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz.length; j++){
            sumafila= sumafila+matriz[i][j]; 
            
        }
        if ( sumafila== validar){
            cont= cont++;
        }
    }
    return cont;
}
public static int sumacolumnas(int matriz[][],int validar){
    int sumacolumnas=0;
    int cont=0;
    for (int j = 0; j < matriz.length; j++){
        for (int i = 0; i < matriz.length; i++){
            sumacolumnas = sumacolumnas+matriz[i][j]; 
            
        }
        if ( sumacolumnas == validar){
            cont= cont++;
        }
    }
    return cont;
}
public static int sumadiagonal(int matriz[][],int validar){
    int sumadiagonal1=0;
    int sumadiagonal2=0;
    int cont1=0;
    int cont2=0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (i == j) {

                sumadiagonal1 = sumadiagonal1 + matriz[i][j];

            }
            if (sumadiagonal1 == validar) {
                cont1 = cont1 ++;
            }
        }
    }
     for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (i+j==2) {

                sumadiagonal2 = sumadiagonal2 + matriz[i][j];

            }
            if (sumadiagonal2 == validar) {
                cont2 = cont2++;
            }
        }   
        
    }
     return cont2+cont1;
}
}


