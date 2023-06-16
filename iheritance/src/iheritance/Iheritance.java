
package iheritance;

 class account
{ private String acno;
private String  pho;
private String DOP;
protected String cle;



 
public account(String n,String pho,String dop,String c)
        { acno=n;
        this.pho=pho;
         DOP=dop;   
          cle=c;  
        }
 public String getAcno()
 { return acno;}
 public String getPho()
 { return pho;}
 public String DOP()
 { return DOP;}
 public String getCle()
 { return cle;}
 
 public void setPho(String pho)
 { pho=pho;}
 public void setDOP(String dop)
 { DOP=dop;}
 }
class Savingaccount extends account
  { public void deposit(String amt)
  { cle=amt;}
  class loanaccount extends account
  { public void payemi(String amt)
  { cle=amt;}



public class Iheritance {

   
    public static void main(String[] args) {
        
    }
    
}
