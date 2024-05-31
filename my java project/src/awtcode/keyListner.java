package awtcode;
import java.awt.*;  
import java.awt.event.*;
public class keyListner extends Frame implements KeyListener{
    Label l;
    TextArea area ;
    keyListner()
    {
        l = new Label();
        area = new TextArea();
        l.setBounds(50, 50 ,400, 30);
        area.setBounds(50, 100, 400, 400);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(500 , 500);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key pressed");
    }
    public void keyReleased(KeyEvent e)
    {
        l.setText("key released");
        String text =  area.getText();
        String [] Words =  text.split("\\s");
        l.setText("words : "+ Words.length + " character  : "+text.length());
    }
    public void keyTyped(KeyEvent e)
    {
        l.setText("key Typed");
    }
    public static void main(String[] args) {
        new keyListner();
    }
}