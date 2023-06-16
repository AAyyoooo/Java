
package menuprog.switchcase;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class MenuprogSwitchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a n b ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.nextLine();
        System.out.println("enter o");
    String option=sc.nextLine();
    System.out.println(option);
    switch(option)
    { case "ADD": System.out.println (a+b);break;
    case "SUB": System.out.println (a-b);break;
    case "MUL": System.out.println (a*b);break;
case "DIV": System.out.println (a/b);break;
    default: System.out.println ("invo");break;
    }}
    }
