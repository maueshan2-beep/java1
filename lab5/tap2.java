import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mainChoice;

        do {
            System.out.println("\n===== НЕГІЗГІ МӘЗІР =====");
            System.out.println("1 – For циклі тапсырмалары");
            System.out.println("2 – While циклі тапсырмалары");
            System.out.println("3 – Do-While циклі тапсырмалары");
            System.out.println("4 – Шығу");
            System.out.print("Таңдау: ");
            mainChoice = sc.nextInt();

            switch(mainChoice) {

                // ================= FOR =================
                case 1:
                    System.out.println("\n--- FOR циклі ---");

                    // Тапсырма 1
                    System.out.println("1-ден 100-ге дейінгі жұп сандар:");
                    for(int i = 1; i <= 100; i++) {
                        if(i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }

                    // Тапсырма 2
                    System.out.print("\n\nN санын енгізіңіз: ");
                    int N = sc.nextInt();
                    int sum = 0;

                    for(int i = 1; i <= N; i++) {
                        sum += i;
                    }

                    System.out.println("Қосынды: " + sum);
                    break;

                // ================= WHILE =================
                case 2:
                    System.out.println("\n--- WHILE циклі ---");

                    // Тапсырма 1
                    int number = -1;
                    while(number <= 0) {
                        System.out.print("Оң сан енгізіңіз: ");
                        number = sc.nextInt();
                    }
                    System.out.println("Дұрыс сан енгізілді!");

                    // Тапсырма 2
                    System.out.print("Факториал үшін N енгізіңіз: ");
                    int num = sc.nextInt();
                    int factorial = 1;
                    int i = 1;

                    while(i <= num) {
                        factorial *= i;
                        i++;
                    }

                    System.out.println("Факториал: " + factorial);
                    break;

                // ================= DO-WHILE =================
                case 3:
                    System.out.println("\n--- DO-WHILE циклі ---");

                    // Тапсырма 1 (Пароль)
                    sc.nextLine(); // buffer тазалау
                    String password;
                    do {
                        System.out.print("Пароль енгізіңіз: ");
                        password = sc.nextLine();
                    } while(!password.equals("1234"));
                    System.out.println("Дұрыс пароль!");

                    // Тапсырма 2 (Ішкі мәзір)
                    int choice;
                    do {
                        System.out.println("\n1 – Хабарлама");
                        System.out.println("2 – Қосу");
                        System.out.println("3 – Шығу");
                        System.out.print("Таңдау: ");
                        choice = sc.nextInt();

                        switch(choice) {
                            case 1:
                                System.out.println("Сәлем!");
                                break;
                            case 2:
                                System.out.print("Екі сан енгізіңіз: ");
                                int a = sc.nextInt();
                                int b = sc.nextInt();
                                System.out.println("Қосынды: " + (a + b));
                                break;
                            case 3:
                                System.out.println("Ішкі мәзірден шығу.");
                                break;
                            default:
                                System.out.println("Қате таңдау!");
                        }

                    } while(choice != 3);

                    break;

                case 4:
                    System.out.println("Бағдарлама аяқталды.");
                    break;

                default:
                    System.out.println("Қате таңдау!");
            }

        } while(mainChoice != 4);

        sc.close();
    }
}