import java.util.Scanner;

public class tap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = sc.nextDouble();
            sum += D[i];
        }

        double avg = sum / 17;
        System.out.println("Average = " + avg);
    }
}