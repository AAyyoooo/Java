/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ioexception;
import java.io.*;

/**
 *
 * @author 91708
 */
public class IOEXCEPTION {
    
    public static void main(String[] args )throws Exception{

   try{
       FileInputStream fis1=new FileInputStream("C:/Users/91708/OneDrive/Desktop/JAVA-PROGRAM/sources.txt");
   
      FileInputStream fis2=new FileInputStream("C:/Users/91708/OneDrive/Desktop/JAVA-PROGRAM/source_new.txt");
      
      FileOutputStream fos=new FileOutputStream("Exception.txt");
      
      SequenceInputStream sis=new   SequenceInputStream(fis1,fis2);
      
      int a;
      while((a=sis.read())!=-1)
      { 
          fos.write(a);
      }
      
      
      fis1.close();
      fos.close();
      sis.close();
      fis2.close();
   
   }catch(FileNotFoundException e)
   { System.out.println(e);}
   catch(IOException e)
      { System.out.println(e);
        }
   
   
   
 }  
}
