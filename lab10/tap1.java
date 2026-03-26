import javax.swing.*;
import java.awt.*;

public class tap1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(20, 20, 100, 60);
        g.drawString("tortburysh", 30, 15);

        g.drawOval(150, 20, 80, 80);
        g.drawString("shenber", 160, 15);

        g.drawLine(50, 120, 200, 120);
        g.drawString("syzyg", 110, 140);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task 1");
        f.add(new tap1());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}