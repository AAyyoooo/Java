
package rectangleheap;

class rectangle
{ public double radius;
public double heigth;
 
public double area()
{ return Math.PI*4*radius*radius;}

public double volume()
{return Math.PI*radius*radius*heigth;}

}
public class Rectangleheap {

   
    public static void main(String[] args) {
        
        {   rectangle r=new rectangle();
             r.radius=8;
   
    r.heigth=9;
    System.out.println(r.area());
    System.out.println(r.volume());
}}
}