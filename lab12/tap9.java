import java.util.Scanner;

public class tap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine();

        String result = str.replaceAll("[aeiouAEIOUәіүұөыоӘІҮҰӨЫО]", "*");

        System.out.println("Нәтиже: " + result);
    }
}