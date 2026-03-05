import java.util.Scanner;

public class tap16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }

        int max = A[0];

        for (int i = 1; i < 10; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        System.out.println("Max element = " + max);
    }
}