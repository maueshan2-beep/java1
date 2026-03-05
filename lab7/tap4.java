import java.util.Scanner;

public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] C = new double[25];
        double p = 1;

        for (int i = 0; i < 25; i++) {
            C[i] = sc.nextDouble();
        }

        for (int i = 0; i < 25; i++) {
            if (C[i] > 0) {
                p *= C[i];
            }
        }

        System.out.println("Product = " + p);
    }
}