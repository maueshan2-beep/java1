import java.util.Scanner;

public class tap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] B = new double[5][5];
        double[] A = new double[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }
            A[i] = sum;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
    }
}