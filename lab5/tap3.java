import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= БІРӨЛШЕМДІ МАССИВ =================
        System.out.println("=== Бірөлшемді массив ===");

        System.out.print("Массив өлшемін енгізіңіз: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Массивті толтыру
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Тапсырма 1: Ең үлкен элемент
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Ең үлкен элемент: " + max);

        // Тапсырма 2: Жұп элементтер саны
        int evenCount = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Жұп элементтер саны: " + evenCount);


        // ================= ЕКІӨЛШЕМДІ МАССИВ =================
        System.out.println("\n=== Екіөлшемді массив ===");

        System.out.print("Жол санын енгізіңіз: ");
        int rows = sc.nextInt();

        System.out.print("Баған санын енгізіңіз: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Матрицаны толтыру
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Тапсырма 1: Барлық элементтердің қосындысы
        int sum = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Матрица элементтерінің қосындысы: " + sum);

        // Тапсырма 2: Әр жолдағы ең үлкен элемент
        for(int i = 0; i < rows; i++) {
            int rowMax = matrix[i][0];
            for(int j = 1; j < cols; j++) {
                if(matrix[i][j] > rowMax) {
                    rowMax = matrix[i][j];
                }
            }
            System.out.println((i+1) + "-жолдың ең үлкен элементі: " + rowMax);
        }

        sc.close();
    }
}