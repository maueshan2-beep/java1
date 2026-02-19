import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Санды енгізіңіз: ");
        double san = scanner.nextDouble();

        if (san > 0) {
            System.out.println("Сан оң.");
        } else if (san < 0) {
            System.out.println("Сан теріс.");
        } else {
            System.out.println("Сан нөлге тең.");
        }
        scanner.close();
    }
}