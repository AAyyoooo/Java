/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package increasing.size.of.an.array;

/**
 *
 * @author 91708
 */
public class IncreasingSizeOfAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int A[]={3,4,5,6,8};
       System.out.println(A.length);

   int B[]=new int[2*A.length];
   
   /**for(int i=0;i<A.length;i++)
   {
        B[i]=A[i];}**/
   A=B;
   
    System.out.println(A.length);
    
    }
    
}
