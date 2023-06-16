
package javaapplication29;


class Super
        { 
    public void pro1()
    { System.out.println("p1");}
    
    public void pro2()
    {System.out.println("p2");
    }
}
    
    
     class Sub extends Super
             { @Override
             public void pro2()
             {System.out.println("p2");}
            
             public void pro3()
             {System.out.println("p3");}
    }
             
            
public class JavaApplication29 {

    
    public static void main(String[] args) {
       
        { Super s=new Sub();
        s.pro2();
        s.pro1();
        }
    
    
    }
    
}
