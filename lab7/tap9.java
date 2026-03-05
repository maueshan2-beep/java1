import java.util.Scanner;

public class tap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] C = new int[5][5];
        int p = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            p *= C[i][i];
        }

        System.out.println("Product = " + p);
    }
}