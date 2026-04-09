import java.util.Scanner;

public class tap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        System.out.print("Таңба енгізіңіз: ");
        String ch = sc.nextLine();

        System.out.println(str.endsWith(ch));
    }
}