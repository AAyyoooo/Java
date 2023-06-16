/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication74;
import java.util.Scanner ;
/**
 *
 * @author 91708
 */
public class JavaApplication74{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String st;
        try (Scanner Sc = new Scanner(System.in)) {
            int n=Sc.nextInt();
            
            for(int i=1;i<n+1;i++)
            {
                
                st=Sc.nextLine();
                
                System.out.println(i+" "+st);
                
            }
        }
        
    }
}


