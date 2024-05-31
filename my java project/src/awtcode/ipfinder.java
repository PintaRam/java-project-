package awtcode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ipfinder extends Frame implements ActionListener {
    Label l ; TextField tf ; Button b; 
    ipfinder()
    {
        tf =  new TextField();
        tf.setBounds(50,50,150,20);
        l = new Label();
        l.setBounds(50,100,250,20);
        b = new Button("FIND IP");
        b.setBounds(50, 150, 95, 30);
        add(tf);
        add(l);
        add(b);
        b.addActionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        try{
            String text  =  tf.getText();
            String t = java.net.InetAddress.getByName(text).getHostAddress();
            l.setText("ip of :"+text +"is:  "+ t);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            l.setText(ex);
        }
    }
    public static void main(String[] args) {
        new ipfinder();
    }
}
