import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String str = sc.nextLine().toLowerCase();

        int vowel = 0, consonant = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouәіүұөыо".indexOf(c) != -1) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Дауысты: " + vowel);
        System.out.println("Дауыссыз: " + consonant);
    }
}