import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Бүтін сан енгізіңіз: ");
        int san = scanner.nextInt();

        if (san % 3 == 0 && san % 5 == 0) {
            System.out.println("Сан 3-ке де, 5-ке де бөлінеді.");
        } else if (san % 3 == 0) {
            System.out.println("Сан 3-ке бөлінеді.");
        } else if (san % 5 == 0) {
            System.out.println("Сан 5-ке бөлінеді.");
        } else {
            System.out.println("Сан 3-ке де, 5-ке де бөлінбейді.");
        }

        scanner.close();
    }
}