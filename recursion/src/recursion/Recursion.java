/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author 91708
 */
public class Recursion {

  static void fun(int n)
   { if(n>0)
   { fun(n-1);
   System.out.println(n);}
           
   }       

    public static void main(String[] args) {
      fun(6);
    }
    
}
