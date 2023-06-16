package rotating.array.from.left;

/**
 *
 * @author 91708
 */
public class RotatingArrayFromLeft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int A[]={23,34,55,78,5,43,454};

int tempo=A[A.length-1];

for(int i=0;i<A.length;i++)
{
    A[i+1]=A[i];
}
A[0]=tempo;
    
    for(int x:A)
        System.out.print( x+",");
    System.out.println(" ");
    
    
    }
    
}



