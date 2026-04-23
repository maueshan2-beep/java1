import java.util.Scanner;

public class labo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1 - 1-ден 10-ға дейін");
            System.out.println("2 - Оң сан енгізу");
            System.out.println("3 - Цифрлар қосындысы");
            System.out.println("4 - Құпиясөз тексеру");
            System.out.println("5 - Факториал");
            System.out.println("6 - Жалғастыру/тоқтату");
            System.out.println("7 - Екі сан қосындысы");
            System.out.println("8 - Жұп сандар қосындысы");
            System.out.println("0 - Шығу");
            System.out.print("Таңдаңыз: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // buffer тазалау

            switch (choice) {

                case 1:
                    int i = 1;
                    do {
                        System.out.println(i++);
                    } while (i <= 10);
                    break;

                case 2:
                    int num;
                    do {
                        System.out.print("Оң сан: ");
                        num = scanner.nextInt();
                    } while (num <= 0);
                    break;

                case 3:
                    System.out.print("Сан: ");
                    int n = scanner.nextInt();
                    int sum = 0;
                    do {
                        sum += n % 10;
                        n /= 10;
                    } while (n > 0);
                    System.out.println("Қосынды: " + sum);
                    break;

                case 4:
                    String pass;
                    do {
                        System.out.print("Құпиясөз: ");
                        pass = scanner.nextLine();
                    } while (!pass.equals("12345"));
                    System.out.println("Дұрыс!");
                    break;

                case 5:
                    System.out.print("Сан: ");
                    int f = scanner.nextInt();
                    int fact = 1, j = 1;
                    do {
                        fact *= j++;
                    } while (j <= f);
                    System.out.println("Факториал: " + fact);
                    break;

                case 6:
                    String ch;
                    do {
                        System.out.println("Операция...");
                        System.out.print("Жалғастыру? ");
                        ch = scanner.nextLine();
                    } while (ch.equalsIgnoreCase("yes"));
                    break;

                case 7:
                    String c;
                    do {
                        System.out.print("a: ");
                        int a = scanner.nextInt();
                        System.out.print("b: ");
                        int b = scanner.nextInt();
                        System.out.println("Қосынды: " + (a + b));
                        scanner.nextLine();
                        System.out.print("Жалғастыру? ");
                        c = scanner.nextLine();
                    } while (c.equalsIgnoreCase("yes"));
                    break;

                case 8:
                    int s = 0, k = 2;
                    do {
                        s += k;
                        k += 2;
                    } while (k <= 100);
                    System.out.println("Қосынды: " + s);
                    break;
            }

        } while (choice != 0);

        System.out.println("Бағдарлама аяқталды");
    }
}