import java.util.Scanner;

public class tap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 25;
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
        }

        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}