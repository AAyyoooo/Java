
package inheritance.pkgsuper;

class rectangle


{ int l;
 int b;

 rectangle()   
 { l=b=1;}
 rectangle( int l, int b)
 { this.l=l;
 this.b=b;}
 }
         

 
class cuboid extends rectangle
{int h;
    cuboid()
    { h=1;}
    cuboid(int h)
    {this.h=h;}
    cuboid(int l, int b, int h)
    { super(l,b);
   this.h=h;}
    
int volume()
{ return l*b*h;}
}

public class InheritanceSuper {

    
    public static void main(String[] args) {
        { cuboid c=new cuboid(8,8,1);
        
        System.out.println(c.volume());}
        }
    }
    

