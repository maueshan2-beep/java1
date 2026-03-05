import java.util.Scanner;

public class tap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] A = new double[12][6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < 6; j++) {
            double p = 1;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    p *= A[i][j];
                }
            }
            System.out.println("Column " + j + " product = " + p);
        }
    }
}