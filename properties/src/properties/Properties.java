
package properties;

class cylinder 
{ private int radius;
private int height;


public cylinder()
{ radius=8; 
height=0;}

public cylinder(int r,int h)
{ radius =r;
height=h;

}
public int getRadius()
{ return radius;

}
public int getHeigth()
{ return height;

}
public int setRadius(int r)
{ if(r>0) return r;
else return 0;}
public int setHeight(int h)
{ if(h>0) return h;
else return 0;
}


}

public class Properties {

    
    public static void main(String[] args) {
        {cylinder c=new cylinder(4,6 );
        
    }
    
    }}
