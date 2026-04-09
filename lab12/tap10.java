import java.util.Scanner;

public class tap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        boolean isNumber = str.matches("[0-9]+");

        if (isNumber) {
            System.out.println("Тек цифрлардан тұрады");
        } else {
            System.out.println("Цифр емес таңбалар бар");
        }
    }
}