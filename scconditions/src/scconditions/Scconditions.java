/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scconditions;

import java.util.Scanner;

/**
 *
 * @author 91708
 */
public class Scconditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the url");
  String url=sc.nextLine();
  String protocole=url.substring(0 , url.indexOf(":"));
  if(protocole.equals("http"))
  { System.out.println("h.......");}
  else if(protocole.equals("ftp"))
  {System.out.println("f.......");
    }
    String domain=url.substring(url.lastIndexOf("."+1));
    if(domain.equals("com"))
    {System.out.println("comercial");}
    else if(domain.equals("org"))
    {System.out.println("organisation");}
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
          

