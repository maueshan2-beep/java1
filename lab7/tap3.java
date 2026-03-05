import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] A = new double[12];
        double p = 1;

        for (int i = 0; i < 12; i++) {
            A[i] = sc.nextDouble();
        }

        for (int i = 0; i < 12; i++) {
            if (A[i] < 0) {
                p *= A[i];
            }
        }

        System.out.println("Product = " + p);
    }
}