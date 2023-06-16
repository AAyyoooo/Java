
 
package rectangle;

class Rectangl
{ public int length;
public int breath;


public int area()
        {return length*breath;}
public int perimeter()
        {return 2*(length+breath);
}
public boolean isSquare()
{ return length==breath;}
}


public class Rectangle {
            
    public static void main(String[] args) {
        // TODO code application logic here
   Rectangl r1=new Rectangl();
   r1.breath=9;
   r1.length=8;
   
   {  System.out.println(r1.area());
   }  }
    
}
