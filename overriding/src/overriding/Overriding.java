
package overriding;

class car
{ public void gear(
)
{System.out.println("manual gaer");}
public void Start()
        
{System.out.println("start");}
public void  accelerate()
        
{System.out.println("Accelerated");}
        }
class Luxarycar extends car
{ public void roof()
{System.out.println("open");      }

public void colour()
{System.out.println("change colour");}

public void Changegear()
{System.out.println("Automatic gear change");}
}
public class Overriding {

    
    public static void main(String[] args) {
        
        { car c=new car();
        c.Start();
        c.gear();
       
        }
    }
    
}
