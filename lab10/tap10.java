import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tap10 extends JPanel {
    Color c = Color.RED;

    public tap10() {
        JCheckBox red = new JCheckBox("Red");
        JCheckBox green = new JCheckBox("Green");
        JCheckBox blue = new JCheckBox("Blue");

        ItemListener listener = e -> {
            if (red.isSelected()) c = Color.RED;
            if (green.isSelected()) c = Color.GREEN;
            if (blue.isSelected()) c = Color.BLUE;
            repaint();
        };

        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        add(red); add(green); add(blue);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillRect(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tap10());
        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}