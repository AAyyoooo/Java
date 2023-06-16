/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.maxelementofarray;

/**
 *
 * @author 91708
 */
public class Maxelementofarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int A[]={120,34,56,78,90,78,56};
        int max1,max2;
                max1=max2=A[0];
        
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            { 
                max2=max1;
              max1=A[i];
            }
            
            else if(A[i]>max2)
            { 
                max2=A[i];
            
            }
        }
    System.out.println(max2);
    
}
}