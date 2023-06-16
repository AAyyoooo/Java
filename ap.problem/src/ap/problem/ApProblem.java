/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap.problem;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class ApProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int d=sc.nextInt();
    int n=sc.nextInt();
    int t=a;
    for(int i=0;i<=n;i++){
       System.out.print(t+",");
       t=t+d;
    }   
       
    }
    
}
