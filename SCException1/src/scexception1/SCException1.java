
package scexception1;
import java.util.*;
import java.io.*;

class stackoverFlow extends Exception
{
public String toString()

   {
    return "stack is full";    
   }
}


class Stackunderflow extends Exception
{
    public String toSting()
    {
        return "stcak is empty";
    }
}

class Stack
{
    private int size;
    private int top=-1;
    private int S[];
    
    public Stack(int z)
            {
                size = z;
                S= new int[z];
            }
    public void push(int x)throws  stackoverFlow 
    {
    if(top==size-1)
    {
         throw new stackoverFlow();
    }
         top++;
         S[top]=x;
    }


public int pop()throws Stackunderflow 
{
int x=-1;
x=S[top];
top--;
return x;
}

}




public class SCException1 {

   
    public static void main(String[] args) {
        
    Stack sc=new Stack(100);
    try {
        sc.push(100);
        //sc.push(10);
        //sc.push(100);
        //sc.push(7);
    }
       
    catch(stackoverFlow s)
         {
        System.out.println(s);
       
         }
       
    }
    
}
    

