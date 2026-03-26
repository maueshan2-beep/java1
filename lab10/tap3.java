import javax.swing.*;

public class tap3 extends JFrame {
    public tap3() {
        JTextField tf = new JTextField(15);
        JButton btn = new JButton("OK");
        JLabel label = new JLabel();

        btn.addActionListener(e ->
                label.setText("Сәлем, " + tf.getText())
        );

        setLayout(new java.awt.FlowLayout());
        add(tf);
        add(btn);
        add(label);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new tap3();
    }
}