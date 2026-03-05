import java.util.Scanner;

public class tap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }

        System.out.println("Average = " + sum / 7);
    }
}