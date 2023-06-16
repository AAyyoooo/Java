
package switchcase;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
      int  day=sc.nextInt();
        
        // TODO code application logic here
   switch(day)
   {  
       case 1: System.out.println("mon");
       break;
       case 2: System.out.println("mn");
       break;
       case 3: System.out.println("n");
       break;
             
       case 4: System.out.println("");break;
       case 5: System.out.println("on");break;
       case 6: System.out.println("mo");break;
       case 7: System.out.println("un");break;
   }
    
    }
    
}
