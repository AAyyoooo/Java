package amstrognumornot;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class Amstrognumornot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int m=n;//isme kiski value kisme ayi 
    int r;
    while(n>0){
        r=n%10;
        sum = sum +r*r*r;
    n=n/10;
     }
    System.out.println(sum);
    if(m==sum)
    {System.out.println("amstrong number" );
    }
    else
    {System.out.println("not a amstron number");}
    }
    
}
