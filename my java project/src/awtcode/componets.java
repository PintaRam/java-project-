import java.awt.*;

public class componets {
    componets() {
        Frame f = new Frame();
        Label l = new Label("NAME : ");
        Label L2 = new Label("SRN NO  : ");
        Label l3 = new Label("SECTION : ");
        TextField T = new TextField();
        TextField T2 = new TextField();
        TextField T3 = new TextField();
        Button b = new Button("SUBMIT");
        f.setSize(1000, 1000);
        l.setBounds(30, 30, 100, 40);
        L2.setBounds(30, 90, 100, 40);
        l3.setBounds(30, 140, 100, 40);
        T.setBounds(150, 30, 100, 40);
        T2.setBounds(150, 90, 100, 40);
        T3.setBounds(150, 140, 100, 40);
        b.setBounds(30, 180, 200, 100);
        f.add(l);
        f.add(L2);
        f.add(l3);
        f.add(T);
        f.add(T2);
        f.add(T3);
        f.add(b);
        f.setTitle("STUDENT DETAILS");
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        componets c = new componets();
    }

}
