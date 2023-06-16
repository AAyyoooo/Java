/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.max.elemnent.in.array;

/**
 *
 * @author 91708
 */
public class MethodMaxElemnentInArray {

    static int Array(int x[])
    {
        int max=x[0];
         for(int i=0;i<x.length;i++)
         { 
             if(x[i]>max)
         
            max=x[i]; 
          System.out.println(max); 
         
         }
                return max;
                  
    }
        public static void main(String[] args){

        int a[]={2,4,5,6,7};
//Array(a[])                
                for(int x:a)
                {    System.out.println(x);}
            
        
        
        
        } }
    

