import java.util.Random;

public class tap15 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[][] a = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = rand.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}