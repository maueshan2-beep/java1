import java.util.Scanner;

public class tap17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();

        if (s4.equals(s5)) {
            System.out.println(s1 + s2);
        } else {
            System.out.println(s1);
        }
    }
}