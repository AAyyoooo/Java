package rotatinngan.array;

public class RotatinnganArray {

    
    public static void main(String[] args) {
        
        
int A[]={1,23,444,45,67,78};
    


 for(int x : A)
 System.out.print(x+" ,");
 System.out.println("'");

int tempo=A[0];    

 
for(int i=1;i<A.length;i++)   
{A[i-1]=A[i];
}

A[A.length-1]=tempo;

for(int x : A)
 System.out.print(x+" ,");
 
    }
    
}
