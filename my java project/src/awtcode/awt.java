package awtcode;
import java.awt.*;
public class awt 
{ awt()
    {
        Frame f  = new Frame();
 f.setSize(1000 , 1000);
 Label l = new Label("Name : ");
 l.setBounds(350 , 400 , 100 , 80);
 TextField t =  new TextField();
 t.setBounds(460 , 400 , 100 , 80);
 Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
 f.add(l);
 f.add(t);
 f.add(b);
f.setVisible(true);
    }
    public static void main(String[] args) {
    awt a =  new awt();
}
 

}
