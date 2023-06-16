/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition.of.pkg2.matries;

/**
 *
 * @author 91708
 */
public class AdditionOf2Matries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
    int A[][]= {{2,3,34,5},{23,5,6,7},{0,89,98,4}};
    int B[][]={{2,3,34,5},{23,5,6,7},{0,89,98,4}};
    int C[][]=new int[3][4];
    for(int i=0;i<=A.length;i++)
    { 
        for(int j=0;j<=B.length;j++)
        { 
            
               C[i][j]=A[i][j]+B[i][j];
           
        
    System.out.println(C[i][j]);
    }}
    
    
    }
    
}
