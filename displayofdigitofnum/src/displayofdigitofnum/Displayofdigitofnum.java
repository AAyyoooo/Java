/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displayofdigitofnum;
import java.util.Scanner;
/**
 *
 * @author 91708
 */
public class Displayofdigitofnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        while(n>0)
        { r=n%10;
          n=n/10;
       
        
        System.out.print(r);}
        
        }
    }
    

