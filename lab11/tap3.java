import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Екі сан енгіз (мысалы: 1 2): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Қосу: " + (a + b));
        System.out.println("Азайту: " + (a - b));
        System.out.println("Көбейту: " + (a * b));

        if (b != 0) {
            System.out.println("Бөлу: " + (a / b));
        } else {
            System.out.println("0-ге бөлуге болмайды!");
        }
    }
}