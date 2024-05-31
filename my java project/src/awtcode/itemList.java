package awtcode;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class itemList extends Frame implements ItemListener {
    Checkbox c1 ,  c2;
    Label l;
    itemList()
    {
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400, 100);
        c1 = new Checkbox("java");
        c2 = new Checkbox("C++");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c1.setBounds(100, 100, 50, 50);
        c2.setBounds(100, 150, 50, 50);
        add(c1);
        add(c2);
        add(l);
        setSize(400 , 400);
        setLayout(null);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == c1)
        l.setText("java checkBox:" +(e.getStateChange() == 1?"checked ": "unchecked"));
        
        if(e.getSource() == c2)
        l.setText("c++ checkBox:" +(e.getStateChange() == 1?"checked ": "unchecked"));
    }
    public static void main(String[] args) {
        new itemList();
    }
}
