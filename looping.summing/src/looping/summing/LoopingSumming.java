/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looping.summing;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class LoopingSumming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
 int   n=sc.nextInt();
int sum=0;
 for(int i=0;i<=n;i++)
 { sum= sum+i;}
 System.out.println(sum);
    
    }
    
}
