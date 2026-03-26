import javax.swing.*;
import java.awt.event.*;

public class tap2 extends JFrame {
    JLabel label;

    public tap2() {
        JButton btn = new JButton("Click");
        label = new JLabel();

        btn.addActionListener(e -> label.setText("Hello Java"));

        add(btn, "North");
        add(label, "Center");

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new tap2();
    }
}