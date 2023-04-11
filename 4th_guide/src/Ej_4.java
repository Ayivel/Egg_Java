/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class Ej_4 {

    public static void main(String[] args) {
        /*
        
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
        muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
        se obtiene cambiando sus filas por columnas (o viceversa).

         */
        crearMatriz();

    }

    public static void crearMatriz() {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");

        }
        System.out.println("=======================");
        matrizTraspuesta(matriz);
    }

    public static void matrizTraspuesta(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[j][i] + " ]");
            }
            System.out.println("");
        }
    }
}
