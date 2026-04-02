import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x санын енгіз: ");
        double x = sc.nextDouble();

        System.out.print("y дәрежесін енгіз: ");
        double y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Нәтиже: " + result);
    }
}