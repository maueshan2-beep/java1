import java.util.Scanner;

public class tap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int[] C = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            C[i] = sc.nextInt();
            sum += C[i];
        }

        double average = sum / n;

        System.out.println("Average = " + average);
    }
}