// implements the mouse motion listner
package awtcode;
import java.awt.*; // awt package
import java.awt.event.*;
public class MOuselistner extends Frame implements MouseMotionListener {
    Label l ;
    Color c = Color.blue;
    MOuselistner()
    {
        l = new Label();
        l.setBounds(20, 30, 100, 40);
        add(l);
        addMouseMotionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void  mouseDragged(MouseEvent e)
    {   l.setText("X = "+ e.getX() + "  y ="+ e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 5, 5);
    }
    public void mouseMoved(MouseEvent e)
    {
         l.setText("X = "+ e.getX() , "  y ="+ e.getY());
    }

    public static void main(String[] args) {  
        new MOuselistner();
}  
}
