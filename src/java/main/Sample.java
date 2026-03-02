import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample extends Frame {
   public Sample() {
       Button btn = new Button("Button");
       btn.setBounds(50, 50, 50, 50);
       add(btn);
       setSize(150, 150);
       setTitle("Simple AWT window");
       setLayout(new FlowLayout());
       setVisible(true);
       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent we) {
               dispose();
           }
       });
   }

   public static void main(String args[]){
       new Sample();
   }
}
