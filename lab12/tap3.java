import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сөйлем енгізіңіз: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Ең ұзын сөз: " + longest);
    }
}