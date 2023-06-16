/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patterns;

import java.util.Scanner;

/**
 *
 * @author 91708
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       int A[]=new int[10];
  
     A[0]=1;
      A[1]=3;
       A[2]=6;
        A[3]=8;
         A[4]=7;
          
         for(int i=0;i<A.length;i++)
         {A[i]=A[i+1];
         A[2]=15;
         System.out.print(A[i]+",");
         }
   
     
} }
