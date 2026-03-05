import java.util.Scanner;

public class tap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) {
                    sum += A[i][j];
                }
            }
            B[i] = sum;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}