/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deleting.element.array;

/**
 *
 * @author 91708
 */
public class DeletingElementArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int A[]={2,3,4,5,67};

for(int x:A)
System.out.print(x+",");
System.out.println("");


int index=1;

for(int i=index;i<A.length-1;i++)
    
{  A[i]=A[i+1];}


for(int i=0;i<A.length;i++)
 System.out.print(A[i]+",");
System.out.println("\n");
}
}