import java.util.Scanner;

public class tap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 25;
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (B[i] > B[j]) {
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}