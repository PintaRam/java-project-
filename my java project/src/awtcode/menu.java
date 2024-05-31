package awtcode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menu extends JFrame implements ActionListener {
    JLabel l ;
    JCheckBox c1 , c2  , c3;
    JButton b;
    menu(){
        l = new JLabel("Food Ordering System");
        l.setBounds(50, 50, 300,20);
        c1 = new JCheckBox("pizza @100");
        c1.setBounds(50, 100, 150, 20);
        c2 = new JCheckBox("burger @30");
        c2.setBounds(50, 150, 150, 20);
        c3 =  new JCheckBox("Tea @10");
        c3.setBounds(50, 200, 150, 20);
        b = new JButton("Order");
        b.setBounds(50,250, 80, 30);
        b.addActionListener(this);
        add(l); 
        add(c1);
        add(c2);
        add(c3);
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        float amount = 0 ;
        String msg = " ";
        if(c1.isSelected())
        {
            amount = amount+100;
            msg = "Pizza : 100\n";
        }
        if(c2.isSelected())
        {
            amount = amount +30;
            msg += "Burger : 30\n";
        }
        if(c3.isSelected())
        {
            amount =  amount +10;
            msg += "Tea : 10\n";
        }
        msg += "-------------------\n";
        JOptionPane.showMessageDialog(this,msg +"Total : "+ amount);
    }
    public static void main(String[] args) {
        new menu();
    }

    }

