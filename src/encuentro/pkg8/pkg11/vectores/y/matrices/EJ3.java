/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg8.pkg11.vectores.y.matrices;

import java.util.Scanner;

/**
 *
 * @author Mario Romero
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int c1=0, c2=0, c3=0, c4=0, c5=0;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*100000);
            System.out.println(vector[i]);
        }
        for (int i = 0; i < n; i++) {
            if (vector[i]>0 && vector[i]<10){
                c1++;
            }
            if (vector[i]>9 && vector[i]<100){
                c2++;
            }
            if (vector[i]>99 && vector[i]<1000){
                c3++;
            }
            if (vector[i]>999 && vector[i]<10000){
                c4++;
            }
            if (vector[i]>9999 && vector[i]<100000){
                c5++;
            }
        }
        System.out.println("Numeros de 1 cifra: "+c1+"\nNumeros de 2 cifras: "+c2+"\nNumeros de 3 cifras: "+c3+"\nNumeros de 4 cifras: "+c4+"\nNumeros de 5 cifras: "+c5 );
    }
    
}
