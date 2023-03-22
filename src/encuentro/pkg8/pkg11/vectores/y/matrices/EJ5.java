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
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        boolean esigual = true;

       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Numero en renglon " + i + " columna "+j + " :");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println("");
        }
       /* EJEMPLO
        matriz[0][0] = 0;
        matriz[0][1]= -2;
        matriz[0][2]=4;
        matriz[1][0]=2;
        matriz[1][1]=0;
        matriz[1][2]=2;
        matriz[2][0]=-4;
        matriz[2][1]=-2;
        matriz[2][2]=0;
*/
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(matriz[i][j] == -1 * transpuesta[i][j])) {
                    esigual = false;
                }
            }
        }
        if (esigual) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
    }   

