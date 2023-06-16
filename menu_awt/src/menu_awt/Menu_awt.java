
package menu_awt;
import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame{
    
    Menu file,sub;
    
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;
    
    
    Myframe()
    { super("menu first ");
    
    open=new MenuItem("open");
    save=new MenuItem("save");
    close =new MenuItem("close");
    closeall = new MenuItem("closeall");
    
    auto=new CheckboxMenuItem("auto");
    
    file=new Menu("file");
    sub=new Menu("sub");
    
    
    file.add(open);
    file.add(auto);
    file.add(sub);
    file.add(save);
    
    sub.add(close);
    sub.add(closeall);
    
    MenuBar mb=new MenuBar();
    mb.add(file);
    setMenuBar(mb);
    
    tf=new TextField(20);
    setLayout(new FlowLayout());
    
   add(tf);
   
   open.addActionListener((ActionEvent ae)->tf.setText("opne"));
   save.addActionListener((ActionEvent ae)->tf.setText("save"));
   close.addActionListener((ActionEvent ae)->tf.setText("close"));
   closeall.addActionListener((ActionEvent ae)->tf.setText("closeall"));
    
        
    }
        
}

public class Menu_awt {

    
   
    public static void main(String[] args) {

        
        Myframe f=new Myframe();
        f.setSize(500,500);
        f.setVisible(true);
     }
    
}
