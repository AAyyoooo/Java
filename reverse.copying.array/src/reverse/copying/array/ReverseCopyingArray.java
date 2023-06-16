/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse.copying.array;

/**
 *
 * @author 91708
 */
public class ReverseCopyingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
int A[]={1,2,3,4,5,6,7,8,9,10};
int B[]=new int[10];   

for(int i=A.length-1,j=0;i>=0;i--,j++)//where j is give upgradation instruction
{ B[j]=A[i];
System.out.print(B[j]);
}


    }}