import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}