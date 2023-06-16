/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copying.array;

/**
 *
 * @author 91708
 */
public class CopyingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
int A[]={1,2,3,4,5,6,7,8,9,10};
int B[]=new int[10];

for(int i=0;i<A.length;i++)
{ B[i]=A[i];
System.out.print(B[i]+",");}



    }
    
}
