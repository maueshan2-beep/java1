import java.util.Scanner;

public class tap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Бұрыш енгіз (радианмен, мысалы: 1): ");
        double angle = sc.nextDouble();

        System.out.println("sin: " + Math.sin(angle));
        System.out.println("cos: " + Math.cos(angle));
        System.out.println("tan: " + Math.tan(angle));
    }
}