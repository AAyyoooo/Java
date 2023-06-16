

package com.mycompany.mavenproject1;




public class Mavenproject1 {

    public static void main(String[] args) {

     int A[][]={{3,3,4},{4,7,8},{6,9,9}}; 
     int B[][]={{5,6,6},{9,9,9},{8,7,7}};
       int C[][]=new int[3][3];
       
       for(int i=0;i<A.length;i++)
       { for(int j=0;j<A[0].length;j++)
       {    C[i][j]=A[i][j]+B[i][j];
       
       
       }   }
   for(int  x[]:C)
   {for(int y:x);
   { System.out.print(y+" ");}
   }       
    }}
    

