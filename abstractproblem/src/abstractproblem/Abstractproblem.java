
package abstractproblem;

abstract class shape
{ 
    int l;
    int b;
    double r;
    abstract public double perimeter();

abstract public double area();


}
class circle extends shape 
{ @Override
public double perimeter()
{ return  Math.PI*2*r;
}
@Override
public double area()
{ return  Math.PI*r*r;
}
}
class rectangle extends shape
{   public double perimeter()
{ return 2*l*b;

}
public double area()
        
{ return l*b;}

}

public class Abstractproblem {

    
    public static void main(String[] args) {
        { circle c=new circle();
        c.r=8;
        System.out.println(c.area());
        }    
    
    }
    
}
