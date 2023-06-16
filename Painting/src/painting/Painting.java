
package painting;
import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame{
    
    int x=0,y=0;
    
    
Myframe(){
    super("paints in awt");
    
    addMouseMotionListener(new MouseAdapter(){
        public void mouseMoved(MouseEvent me)
        {
            x=me.getX();
            y=me.getY();
            repaint();
            
        }
    });
    
    
}
 public void paint(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Luminari",Font.BOLD,30));
        g.drawString("BEING YOURSELF IS NOT BEING SELFSH", x, y);
    }
}
public class Painting {

    
    public static void main(String[] args) {
        Myframe f=new Myframe();
        f.setSize(500,500);
        f.setVisible(true);

    }
    
}
