
package reverse.of.string;

/**
 *
 * @author 91708
 */
public class ReverseOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
    String str="iomu";
  String empty="";
  char ch;
  
  for(int i=0;i<str.length();i++)
  {
      ch=str.charAt(i);
      empty=ch+empty;
  }
   System.out.println(empty);
  
  
    }
    
}
