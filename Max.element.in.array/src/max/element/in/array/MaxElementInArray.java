/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package max.element.in.array;

/**
 *
 * @author 91708
 */
public class MaxElementInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int A[]={2,34,56,78,90,98,65};
int max1=A[0];
for(int i=0;i<A.length;i++)
    if(A[i]>max1)
    { max1=A[i];
   
    
    }
System.out.println(max1);   
    }
    
}
