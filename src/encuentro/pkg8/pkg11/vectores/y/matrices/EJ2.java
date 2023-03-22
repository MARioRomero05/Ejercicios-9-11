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
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int [] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*100);
        }
        System.out.println("Ingrese un numero a buscar");
        int search=read.nextInt();
        boolean found=false;
        for (int i = 0; i < n; i++) {
            if (vector[i]==search) {
                System.out.println("Su numero se encuentra en el indice: "+i);
                found=true;
                break;
            } else {
                found=false;
            }
        }
        System.out.println("Su numero se encontro en el vector?: "+found);
    }   
}
