/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_vec;

import java.util.Scanner;


public class Vector extends Ejer_vec implements OrientacionInterface {
    int [] vec ;
    Scanner op2=new Scanner(System.in);
    public  Vector(){
        int tamaño;
        int dato;
        System.out.println("digite el tamaño del vector: ");
        tamaño=op2.nextInt();
        vec = new int [tamaño];
        for(int i=0;i<vec.length;i++){
            System.out.println("dijite el dato de la pocicion"+i);
            vec[i]=op2.nextInt();
        }
    }
    
  public void Descendente(){
     int aux;
      int j;
      int i;
      
        for(i=0;i<=vec.length;i++){
           for(j=i+1;j<vec.length;j++){
               if(vec[i] > vec[j]){
                   aux = vec[i];
                   vec[i] = vec[j];
                   vec[j] = aux;
               }
           }
        }
      impresion();
  }      
  public void Ascendente(){
      int aux;
      int j;
      int i;
      
        for(i=0;i<=vec.length;i++){
           for(j=i+1;j<vec.length;j++){
               if(vec[i] < vec[j]){
                   aux = vec[i];
                   vec[i] = vec[j];
                   vec[j] = aux;
               }
           }
        }
      impresion();
  }
 public void impresion(){
     for(int i=0; i<vec.length;i++){
         System.out.println("vector pocicion:"+i);
        System.out.println(vec[i]);
     }
 }  
}

