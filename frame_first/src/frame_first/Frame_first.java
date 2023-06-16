
package frame_first;
import java.awt.*;
public class Frame_first {

   
    public static void main(String[] args) {
     Frame f=new Frame("first frame ");
    Button b=new Button("lick me");
     f.setVisible(true);
     f.setSize(400,400 );
    f.add(b);
    b.setBounds(0, 0, 20, 30);
     
    }
    
}
