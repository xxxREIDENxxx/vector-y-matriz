/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_vec;
import java.util.Scanner;

public class Matriz {
    int [][]matriz;
    Scanner op2=new Scanner(System.in);
    public Matriz(){
        int tamaño;
        int dato;
        
        System.out.println("Digite el tamaño de la Matriz: ");
        tamaño = op2.nextInt();
        matriz = new int [tamaño][tamaño];
        System.out.println("dijite los datos de la matriz:");
        for(int i=0;i<matriz.length;i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j]=op2.nextInt();
            }
            System.out.print(" "+"\n");
        }
        
    }
    
    // metodos de interfaz
     public void Descendente(){
      int aux;
      int j;
      int i;
      int x;
      int y;
      
        for(i = 0; i < matriz.length; i++){
           for(j = 0; j < matriz.length; j++){
               for(x = 0; x < matriz.length; x++){
                   for(y = 0; y < matriz.length; y++){
                       if(matriz[i][j] < matriz[x][y]){
                         aux = matriz[i][j];
                         matriz[i][j] = matriz[x][y];
                         matriz[x][y] = aux;
                       }
                   }
                }
             }
        } 
    impresion();
    }
    public void Ascendente(){
      int aux;
      int j;
      int i;
      int x;
      int y;
      
        for(i = 0; i < matriz.length; i++){
           for(j = 0; j < matriz.length; j++){
               for(x = 0; x < matriz.length; x++){
                   for(y = 0; y < matriz.length; y++){
                       if(matriz[i][j] > matriz[x][y]){
                         aux = matriz[i][j];
                         matriz[i][j] = matriz[x][y];
                         matriz[x][y] = aux;
                       }
                   }
               }
           }
        } 
    impresion();
  }
    public void impresion(){
        System.out.println("-----MATRIZ ORDENADA------");
        for(int i=0;i< matriz.length;i++){
            for(int j = 0; j < matriz.length; j++){
            System.out.print(matriz[i][j]+" ");
            
            
            }
            System.out.print(" "+"\n");
        }
        
    }  
    
   
}
