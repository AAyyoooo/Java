/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radix.number;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class RadixNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;
        num=sc.nextLine();
        {
            if(num.matches("[01]+")){
                System.out.println("binary");
            }
            else
             if(num.matches("[0-7]+"))
             {System.out.println("br");
             }  
            else
        if(num.matches("[0-9A-F]+"));
            {  System.out.println("53brr");
            }
        }
    }
    
}
