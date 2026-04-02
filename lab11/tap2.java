import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан енгіз: ");
        double num = sc.nextDouble();

        if (num >= 0) {
            System.out.println("Түбір: " + Math.sqrt(num));
        } else {
            System.out.println("Теріс санның түбірі жоқ!");
        }
    }
}