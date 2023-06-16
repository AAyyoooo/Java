
package string.vovel.count;
import java.util.Scanner;



public class StringVovelCount {

//Write a program that takes a string input and outputs the number of vowels in the string.
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     //vovels are a,e,i,o,u.
     name=name.toLowerCase();
     int vowel=0;
     for(int i=0;i<name.length();i++)
     {
         if(name.charAt(i)=='a'
         ||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u' )
         vowel++;
                 
     }
    
    
    System.out.println("total no. of vovels are"+vowel);
    
    }
 
}
