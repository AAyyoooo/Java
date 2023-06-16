
package abstraction.classes;

abstract class Main{
    
    abstract public double  perimeter();
    abstract public  double 
         area();
    
}

class cirlce extends Main{
    
    double  r;
    
    
    public double perimeter(){
      return 2*Math.PI*r;
    }
   
    public double area(){
        return Math.PI*r*r;
        
    }
}
class rectangle extends Main{
    double  len;
    double bre;
    public double perimeter()
    {
        return 2*(len+bre);
        
        }
public double area()
{
    return len*bre ;
}


}

    


public class AbstractionClasses {

    
    public static void main(String[] args) {
        
    
   Main c=new cirlce();
   
   c.area();
   System.out.println(c.area());
}
}