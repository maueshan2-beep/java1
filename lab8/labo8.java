import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class labo8 extends JFrame {

    int type;

    labo8(String title, int type) {
        super(title);
        this.type = type;

        setSize(700, 400);
        setVisible(true);
        setLocation(200, 100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics gr) {
        super.paint(gr);

        // Фон
        gr.setColor(Color.WHITE);
        gr.fillRect(0, 0, 700, 400);

        // Тор
        gr.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 700; i += 30)
            gr.drawLine(i, 0, i, 400);
        for (int i = 0; i < 400; i += 30)
            gr.drawLine(0, i, 700, i);

        // Осьтер
        gr.setColor(Color.BLACK);
        gr.drawLine(350, 0, 350, 400);
        gr.drawLine(0, 200, 700, 200);

        // График
        gr.setColor(Color.RED);

        for (double x = -350; x < 350; x++) {

            double X = x / 50; // масштаб
            double y = 0;

            try {
                switch (type) {

                    case 1: y = 3 * X; break;                       // y=3x
                    case 2: y = X * X; break;                       // x^2
                    case 3: y = X * X * X; break;                   // x^3
                    case 4: y = Math.sqrt(Math.abs(X)); break;      // √x
                    case 5: y = 1 / (X + 0.1); break;               // 1/x
                    case 6: y = Math.sin(X); break;                 // sin
                    case 7: y = Math.cos(X); break;                 // cos
                    case 8: y = (X*X + 1) / (X + 0.1); break;       // күрделі
                    case 9: y = (X + 3) / (X - 2); break;
                    case 10: y = (2*X + 3) / (X*X + 1); break;
                    case 11: y = (2*X - 3) / (X*X + 1); break;
                    case 12: y = 1 / (X*X + 1); break;
                    case 13: y = 1 / (X*X + 2*X + 1); break;
                    case 14: y = 1 / (X*X + 3*X + 1); break;
                    case 15: y = X / (X*X + 2*X + 1); break;
                    case 16: y = X / (X*X + 2*X + 1); break;
                    case 17: y = X / (X*X - 2*X + 1); break;
                    case 18: y = X / (X*X + 3*X + 1); break;
                    case 19: y = X / (X*X - 3*X + 1); break;
                    case 20: y = (3*X*X) / (X - 5 + 0.1); break;

                }

                int Y = (int)(y * 50);

                gr.drawLine((int)x + 350, 200 - Y,
                        (int)x + 350, 200 - Y);

            } catch (Exception e) {
                // бөлу 0-ге болмас үшін
            }
        }
    }

    public static void main(String[] args) {

        JFrame menu = new JFrame("Таңдау");
        menu.setSize(300, 600);
        menu.setLayout(new GridLayout(20,1));
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 1; i <= 20; i++) {
            int t = i;
            Button btn = new Button("Функция " + i);

            btn.addActionListener(e ->
                    new labo8("Graph " + t, t));

            menu.add(btn);
        }

        menu.setVisible(true);
    }
}