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
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int aux, suma;
        boolean esigual = true;
        System.out.println("Ingrese valores del 1 al 9");
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                System.out.print("[" + i + "]" + "[" +j+ "]:");
                aux = leer.nextInt();
                }while(aux<1 || aux>10);
                matriz[i][j]= aux;
            }
            System.out.println("");
        }
       
       aux = matriz[0][0]+ matriz[0][1]+ matriz[0][2];
       suma=0;
               
      for (int i = 1; i < 3; i++){
           for (int j = 0; j < 3; j++){
                  suma= suma+matriz[i][j];             
           } 
           if(aux!=suma) esigual= false;
           suma=0;
      }
      
           suma =0;
          for (int j = 0; j < 3; j++) {
              for (int i = 0; i < 3; i++) {
                  suma= suma+matriz[i][j];
              }
              if(suma!= aux) esigual= false;
              suma=0;
          }
          
          suma= matriz[0][0]+matriz[1][1]+matriz[2][2];
          if(suma!=aux) esigual=false;
          
          suma= matriz[2][0]+matriz[1][1]+matriz[0][2];
          if(suma!=aux) esigual=false; 
          
          System.out.println("El cuadrado es Magico?: " + esigual);
     
           
        }
    }
    

