import javax.swing.*;
import java.awt.*;

public class tap4 extends JPanel {
    Color c = Color.RED;

    public tap4() {
        JButton btn = new JButton("Change Color");
        btn.addActionListener(e -> {
            if (c == Color.RED) c = Color.GREEN;
            else if (c == Color.GREEN) c = Color.BLUE;
            else c = Color.RED;
            repaint();
        });
        add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tap4());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}