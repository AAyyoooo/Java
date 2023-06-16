/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ma.num.varags;

/**
 *
 * @author 91708
 */
public class MaNumVarags {

    
  static  int max(int...A)
    {
        if(A.length==0)
            return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max )
                max=A[i];
       //   System.out.println(max);    
               
        } return max ;      
    }
        public static void main(String[] args) {
        
        System.out.print(max());
        
        
    }
    
}
