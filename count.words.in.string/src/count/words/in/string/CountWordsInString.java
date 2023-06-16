/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package count.words.in.string;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class CountWordsInString {

   //Write a program that takes a string input and outputs the number of words in the string.

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     
    String name2[]=name.split(" ");
    
    System.out.println("no. of word is " + name2.length   );
      
//  vowel ma for length ka liye .length() use hota hia while yaha .length asaaa kyu...?  
    }
    
}
