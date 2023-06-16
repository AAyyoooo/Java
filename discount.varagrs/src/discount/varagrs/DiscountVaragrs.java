/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discount.varagrs;

/**
 *
 * @author 91708
 */
public class DiscountVaragrs {

   
        
    
   static double discount(double ...A)
  {
      double s=0;
           // s=A[0];

    for(int i=0;i<A.length;i++)
    { s=s+A[i];}
    
      if(s>=7)
          return s*0.9;
      else if(s>8 && s<=100)
          return s*0.75 ;
        else if(s>101)
            return s*0.5;
        else 
            return 0;
  }
      
      
public static void main(String[] args) {
     
        
    System.out.print(discount(4,5,7,8));
    
}
   }
