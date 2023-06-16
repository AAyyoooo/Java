import java.util.Scanner;
public class Practice{
public static void main(String[] args){

Float a,b,c;
Scanner i=new Scanner(System.in);
System.out.println("write..?");
a=i.nextFloat();
b=i.nextFloat();
c=i.nextFloat();

Double A, s;

s=0.5*(a+b+c);
A=Math.sqrt(s*(s-a)*(s-b)*(s-b));
System.out.println(A);
 }

    
}
