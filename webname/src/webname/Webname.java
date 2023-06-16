
package webname;
import java.util.Scanner;

public class Webname {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String ext= str.substring(str.indexOf(".")+1);
       
       switch(ext)
               { case"com": System.out.println("comerccial");
               break;
               case "org": System.out.println("organisation");
               break;
               default : System.out.println("invo");
               
       }
    }
    
}
