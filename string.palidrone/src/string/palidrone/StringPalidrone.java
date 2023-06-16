/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.palidrone;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class StringPalidrone {
//Write a program that takes a string input and checks whether it is a palindrome or not.

    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     char ch;
    String  empty="";
    for(int i=0;i<name.length();i++)
    {
        ch=name.charAt(i);
        empty=ch+empty;
        
    }
     System.out.println(empty);
     
     if(empty.equals(name ) )
     {System.out.println("yes its palindrome ");
     
     }
     else 
         
     {System.out.println("noppeee   its palindrome ");
       
    }
    
    }}
