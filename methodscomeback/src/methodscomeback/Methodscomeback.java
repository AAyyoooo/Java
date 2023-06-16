/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodscomeback;

/**
 *
 * @author 91708
 */
public class Methodscomeback {

    static int rev(int n)
 { int m=0;
 { while(n>0)

 m=m*10+n%10;
 n=n/10;
 }   
 return m;
 }
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print(rev(12));
    }
    
}
