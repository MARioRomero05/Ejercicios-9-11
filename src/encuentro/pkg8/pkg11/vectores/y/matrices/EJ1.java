/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg8.pkg11.vectores.y.matrices;

/** Realizar un algoritmo que llene un vector con los 100 primeros números
    enteros y los muestre por pantalla en orden descendente.    
 *
 * @author Mario Romero
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[101];
        for (int i = 100; i >= 0; i--) {
            vector[i]=i;
            System.out.println(vector[i]);
        }        
        }
    }
    

