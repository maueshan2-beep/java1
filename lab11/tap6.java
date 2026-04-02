import java.util.ArrayList;
import java.util.Scanner;

public class tap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            System.out.print("Екі сан енгіз (мысалы: 1 2) немесе 'exit': ");

            if (sc.hasNext("exit")) {
                break;
            }

            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double result = a + b;

            String record = a + " + " + b + " = " + result;
            history.add(record);

            System.out.println("Нәтиже: " + result);

            System.out.println("Тарих:");
            for (String h : history) {
                System.out.println(h);
            }

            System.out.println("-------------------");
        }

        System.out.println("Бағдарлама аяқталды!");
    }
}