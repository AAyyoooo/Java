/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.pkgint.varagrs;

/**
 *
 * @author 91708
 */
public class SumIntVaragrs {

   static int sum(int ...A)
    { int s=0;
           // s=A[0];

    for(int i=0;i<A.length;i++)
    s=s+A[i];
       return s;
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
   
    System.out.print(sum(1,2,3));
    }
    
}
