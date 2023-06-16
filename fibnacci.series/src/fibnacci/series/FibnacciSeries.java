/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibnacci.series;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class FibnacciSeries {

    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
     int a=0,b=1,c;
      int n=s.nextInt();
   
System.out.print(a+","+b+",");
      for(int i=0;i<=n;i++)
      { c=a+b;
          System.out.print(c+",");
     a=b;
     b=c;
    }
    }
}
