
package pkgabstract;

 abstract class Super
        { 
            public  Super()
        { System.out.println("super constructor ");}
        public void meth1()
        {System.out.println("meth of super ");}
   abstract public void meth2()
  ;
        }
 

  class sub extends Super 

 { 
    public void meth2()
    {System.out.println("meth2");
 
   
     
    }
 }
public class Abstract {
   
    
    
    public static void main(String[] args) {
       
   
      
        { Super s=new sub();
        s.meth2();
        }
    

}}
