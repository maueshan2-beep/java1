import java.util.Scanner;

public class tap14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 30;
        int[] D = new int[n];

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            D[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (D[i] % 2 == 0) {
                evenSum += D[i];
            } else {
                oddSum += D[i];
            }
        }

        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }
}