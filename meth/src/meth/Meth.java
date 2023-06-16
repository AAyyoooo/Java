

package meth;

/**
 *
 * @author 91708
 */
public class Meth {

    static int rev(int n)
 { int m=0;
  while(n>0)
  {
 m=m*10+n%10;
 n=n/10;
 }   
 return m;
 }
  int [] reve(int A[])
 { int B[]=new int[A.length];
         for(int i=A.length-1,j=0;i>=0;i--,j++)
 B[j]=A[i];
         return B;
 }
 
    public static void main(String[] args) {
       
 System.out.println(reve(66,7));
    }
    
}
