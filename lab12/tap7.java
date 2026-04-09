import java.util.Scanner;

public class tap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Кері жол: " + reversed);
    }
}