import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}