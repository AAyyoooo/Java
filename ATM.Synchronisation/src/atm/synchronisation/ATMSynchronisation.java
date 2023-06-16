
package atm.synchronisation;



class Atm{
  
    
    
synchronized public void checkbalance(String name)
 
 {
     System.out.println(name  +      "_yup i'm that bastered");
     try{Thread.sleep(1000);}
     catch(Exception e){}
     
     System.out.println("balance");
         
 }
     
synchronized public   void withdraw(String name , int amt)
{
 System.out.println(amt);
 try{Thread.sleep(1000);}
 catch(Exception e){}
 System.out.print("balance");
 
}
 
}
class customer extends Thread{
    
        
      Atm atm;
      String name;
      int amt ;
      
      
      customer(String na ,Atm ma, int a )
      { 
          atm=ma;
          name=na;
          amt=a;
      }
      
      
      public void useATM()
      {
          atm.checkbalance(name);
          atm.withdraw(name,amt)  ;        
      }
      @Override
      public void run()
      {
          useATM();
      }
      
      
    }



public class ATMSynchronisation {

        public static void main(String[] args) {
            
            Atm atm=new Atm();
            customer c1=new customer("ayush",atm,100);
            customer c2=new customer("hola",atm,200);
            c1.start();
             c2.start();
    }
    
}
