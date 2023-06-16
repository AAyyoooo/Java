/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseofanum;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class Reverseofanum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,rev=0;
        int m=n;
        while(n>0)
        { r=n%10;
         rev=rev*10+r;
    n=n/10;
           }
        System.out.println(rev);
        if(m==rev)
        {System.out.println("its a palindrone");}
        else
        {System.out.println("not a palindrone");
        
        }
    }
    
}
