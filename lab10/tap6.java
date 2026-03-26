import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tap6 extends JPanel {
    int x, y;

    public tap6() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 5, 5);
        g.drawString("X=" + x + " Y=" + y, 20, 20);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tap6());
        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}