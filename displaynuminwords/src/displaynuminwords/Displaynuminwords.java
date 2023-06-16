package displaynuminwords;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class Displaynuminwords {

    /*
      @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int  n=sc.nextInt();
   int r=0;
     String str=" ";
   
     while(n>0)
     {//ye run nhi ho raha shi se
        r=(r*10)+n%10;
        n=n/10;
        //str=str+r;
      }
     System.out.println(r);
     
   
    }
} 