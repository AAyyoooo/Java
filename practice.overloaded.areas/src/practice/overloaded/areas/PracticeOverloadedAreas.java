
package practice.overloaded.areas;

/**
 *
 * @author 91708
 */
public class PracticeOverloadedAreas {

   static int Area(int a,int b)
    {
      int  area=a*b;
      return area;
    }
   static double Area(double r)
   {
       double area = Math.PI*r*r;
       return area;
   } 
   static double Area(int h,int a,int b)
   {
       double area = 0.5*(a+b)*h;
       return area;
   }
    public static void main(String[] args) {
      
       System.out.println(Area(2,3)); 
        System.out.println(Area(20)); 
        System.out.println(Area(2,9,3)); 
        
        
    }
    
}
