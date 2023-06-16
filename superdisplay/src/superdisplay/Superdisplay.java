
package superdisplay;

class rectangle
{
    int l;
    int b ;
    int x=10;
    rectangle(int length , int breagth)
    { this.l=length;
    this.b=breagth;
    }
    void d()
    { System.out.println(this.l);
    System.out.println(this.b);}
    
}
class cuboid extends rectangle
{
int height;
int x=20;

cuboid(int h, int l, int b)
{ 
    super(l,b);
    height=h;

}

 void d()
    { System.out.println(x);
    System.out.println(super.x);}
}

public class Superdisplay {

    
    public static void main(String[] args) {
       
        { cuboid c=new cuboid(8,3,9);
        c.d();
        }
        
        }
        
      
    
    
}
