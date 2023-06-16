/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplication.mattices;

/**
 *
 * @author 91708
 */
public class MultiplicationMattices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int A[][]= {{2,3,34},{23,5,6},{0,88,4}};
int B[][]={{1,0,0},{0,1,0},{0,0,1}};
int C[][]=new int[3][3];
for(int i=0;i<A.length;i++) 
{
    for(int j=0;j<A.length;j++) 
    {
        for(int k=0;k<A.length;k++)
        {
            C[i][j]=A[i][k]*B[k][j]+C[i][j];
        }

    }
}
    
    for(int x[]:C)
    {
        for(int y:x)
            System.out.print(y+" ");
    
    System.out.println();}}
    
}
