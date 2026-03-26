import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tap7 extends JPanel {
    char ch = ' ';

    public tap7() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                ch = e.getKeyChar();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Typed: " + ch, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        tap7 panel = new tap7();
        f.add(panel);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}