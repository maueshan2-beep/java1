import javax.swing.*;

public class tap8 extends JFrame {
    public tap8() {
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JButton btn = new JButton("+");
        JLabel res = new JLabel();

        btn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            res.setText("Result: " + (a + b));
        });

        setLayout(new java.awt.FlowLayout());
        add(t1); add(t2); add(btn); add(res);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new tap8();
    }
}