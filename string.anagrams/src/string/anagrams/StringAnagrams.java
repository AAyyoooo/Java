
package string.anagrams;
import  java.util.Arrays;

public class StringAnagrams {

   
  static String  ssort(String input ){
   
    char Array[]= input.toCharArray();
    
    Arrays.sort(Array);
    
    return new  String(input);
 
  }  
  
    public static void main(String[] args) {
   
      
//Write a program that takes two string inputs and checks if they are anagrams (i.e., if they contain the same letters but in a different order).  
        
//idea is i should take two string ...dono ko  chota kardo .Tolowercase   then if check length 
   
    String str1="acsd";
    String str2="dsac";
    String out1=ssort(str1);
    String out2=ssort(str2);
   System.out.println(out1);
    
   System.out.println(out2);

   
   if(str1.equals(str2))
   {
          System.out.println("yes its anagram");

   }
   else
   { 
       System.out.println("nopeeeeee it is not  anagram");
   }

   
   
   
    }
    
}
