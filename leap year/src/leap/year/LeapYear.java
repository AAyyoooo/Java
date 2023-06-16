   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leap.year;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
Scanner sc=new Scanner(System.in); 
   int  yr=sc.nextInt();
    {if(yr%4==0)
        {if(yr%100==0)
            {if(yr%400==0)
                   {System.out.println("ear");}
        
                 else {System.out.println("noes");}
            }
        
        else 
             {System.out.println("ear");}
        }
        else 
             {System.out.println("noes");}
    }
    
    
    
    
    }
    
}
