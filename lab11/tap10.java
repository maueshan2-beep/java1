import java.util.*;

public class tap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Өрнек енгіз (мысалы: 2 + 3 * 4): ");
        String input = sc.nextLine();

        String[] tokens = input.split(" ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(tokens));

        // Алдымен * және /
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("*") || list.get(i).equals("/")) {
                double a = Double.parseDouble(list.get(i - 1));
                double b = Double.parseDouble(list.get(i + 1));
                double result = 0;

                if (list.get(i).equals("*")) {
                    result = a * b;
                } else {
                    result = a / b;
                }

                list.set(i - 1, String.valueOf(result));
                list.remove(i);     // оператор
                list.remove(i);     // b
                i--;
            }
        }

        // Сосын + және -
        double result = Double.parseDouble(list.get(0));

        for (int i = 1; i < list.size(); i += 2) {
            String op = list.get(i);
            double num = Double.parseDouble(list.get(i + 1));

            if (op.equals("+")) {
                result += num;
            } else {
                result -= num;
            }
        }

        System.out.println("Нәтиже: " + result);
    }
}