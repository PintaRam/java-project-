
import java.awt.*;

public class firtsawtcode extends Frame {
    firtsawtcode() {
        Button b = new Button("click on");
        b.setBounds(30, 100, 80, 20);
        add(b);
        setSize(10000, 20000);
        setTitle("global user interface");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        firtsawtcode obj = new firtsawtcode();
    }
}
