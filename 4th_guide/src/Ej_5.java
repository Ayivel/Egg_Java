/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class Ej_5 {
    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
        pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz 
        A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

        
        */
        int[][] matriz= {{0,-2,4},{2,0,2},{-4,-2,0}};
        traspuesta(matriz);
        
        
    }
    
   public static void traspuesta(int matriz[][]){
     int[][] matrizTraspuesta = new int[3][3];
     int cont=0;
       for (int i = 0; i <matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
              matrizTraspuesta[i][j]=matriz[j][i];
           }
       }
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
               if (matriz[i][j]==-matrizTraspuesta[i][j]) {
                   cont++; 
               }else{
                   
               continue;
               }
               
                       
           }
       }
       if (cont==9) {
         System.out.println("La matriz es antisimetrica");
     }else  {
       System.out.println("La matriz no es antisimetrica");
       }
   }

}
