import java.util.Scanner;

public class tap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан және пайыз енгіз (мысалы: 200 10): ");
        double a = sc.nextDouble(); // сан
        double b = sc.nextDouble(); // пайыз

        double result = (a * b) / 100;

        System.out.println(b + "% of " + a + " = " + result);
    }
}