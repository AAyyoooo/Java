/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resourcesdemo;
import java.io.*;
import java.util.*;


public class ResourcesDemo 
{
    static Scanner sc;
    static void Divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("\"C:\\Users\\91708\\OneDrive\\Desktop\\JAVA-PROGRAM\\Test.txt\"");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/b);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        int x=sc.nextInt();
        
        System.out.println(x);
        
    }
    
}