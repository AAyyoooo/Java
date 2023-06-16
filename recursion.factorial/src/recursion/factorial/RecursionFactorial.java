/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion.factorial;

/**
 *
 * @author 91708
 */
public class RecursionFactorial {

   public static int fib(int n)
   {
       if(n<=1)
           return n;
   
   return fib(n-1)+fib(n-2);
   
   
   }
       
    public static void main(String[] args) {
    int n=5;
    
    for(int i=0;i<n;i++)
    {
        System.out.print(fib(i)+"");
    
    }
    }
    
}
