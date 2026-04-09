import java.util.Scanner;

public class tap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        System.out.print("Сөз енгізіңіз: ");
        String word = sc.nextLine();

        System.out.println(str.startsWith(word));
    }
}
