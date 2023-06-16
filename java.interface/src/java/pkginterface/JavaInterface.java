/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.pkginterface;


interface Member
{
  public  void callback();
}


class store 
{
    Member mem[]=new Member[100];
    int n=0;
    void register(Member m)
    {
        mem[n++]=m;
    }
    void inviterecall()
    {
        for(int i=1;i<=n;i++)
         mem[i].callback();
           
    }
}
    
    class customer implements Member
    {
     String name;
       customer(String n){
        name=n; 
     }
     @Override
    public void callback(){ 
        
         System.out.println("ok , i will visit"+name);
     }
    }
        

public class JavaInterface {

    public static void main(String[] args) {
        // TODO code application logic here
        store s=new store();
        
    customer c1=new customer("ayush");
   
    s.register(c1);
    s.inviterecall();
            
}
}
