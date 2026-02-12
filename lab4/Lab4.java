import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 1-ден N-ге дейінгі сандардың қосындысы
        System.out.print("1-ден N-ге дейінгі қосынды үшін N санын енгізіңіз: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Қосынды: " + sum);

        // 2. 1-ден 20-ға дейінгі жұп сандар
        System.out.print("1-ден 20-ға дейінгі жұп сандар: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        // 3. Факториал есептеу
        System.out.print("Факториал есептеу үшін N санын енгізіңіз: ");
        int f = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial *= i;
        }
        System.out.println(f + " санының факториалы: " + factorial);

        // 4. Қайталанатын символдар (мысал ретінде '*')
        System.out.print("Қанша рет '*' символын шығару керек? ");
        int repeat = sc.nextInt();
        int i = 0;
        while (i < repeat) {
            System.out.print("*");
            i++;
        }
        System.out.println();

        // 5. 1-ден 100-ге дейінгі тақ сандар (do-while)
        int j = 1;
        System.out.print("1-ден 100-ге дейінгі тақ сандар: ");
        do {
            if (j % 2 != 0) System.out.print(j + " ");
            j++;
        } while (j <= 100);
        System.out.println();

        // 6. Пайдаланушыдан сандар енгізу және олардың қосындысы
        int sumInput = 0;
        int number;
        System.out.println("Сандар енгізіңіз (тоқтату үшін 0 енгізіңіз):");
        do {
            number = sc.nextInt();
            sumInput += number;
        } while (number != 0);
        System.out.println("Енгізілген сандардың қосындысы: " + sumInput);
    }
}
