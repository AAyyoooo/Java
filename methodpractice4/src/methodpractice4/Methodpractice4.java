
package methodpractice4;


public class Methodpractice4 {

   static  int max(int ...A)
    {
        if(A.length==0)return Integer.MIN_VALUE;
            
   int max=A[0];
    for(int i=0;i<A.length;i++)
 
    if(A[i]>max)
      A[i]=max;
    return max;
    }  
    public static void main(String[] args) {
   System.out.println(max()); 
    }
    
}
