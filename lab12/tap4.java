import java.util.Scanner;

public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        int count = str.replace(" ", "").length();

        System.out.println("Таңбалар саны: " + count);
    }
}