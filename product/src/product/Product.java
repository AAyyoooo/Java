
package product;

class properties
{ private String itemno;
private String name;
private int quantity;


public String getItemno()
{ return itemno;}
public String  getName()
{ return name;}
public double getQuantity()
{ return quantity;}



public double setQuantity(int q)
{if(q>=0)
    return q;
else return 0;
}
public properties( String name, String itemno,int quantity )
{    this.name=name; 
itemno="on";
quantity=9;
}               }                     

public class Product {

    
    public static void main(String[] args) {
   
     
                
                }
    }
    
}
