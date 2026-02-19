import java.util.Scanner;

public class tap1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- IF-ELSE ----------------
        System.out.println("1-Тапсырма: Санның оң, теріс немесе нөл екенін анықтау");
        System.out.print("Санды енгізіңіз: ");
        double san = sc.nextDouble();

        if (san > 0) {
            System.out.println("Сан оң.");
        } else if (san < 0) {
            System.out.println("Сан теріс.");
        } else {
            System.out.println("Сан нөлге тең.");
        }

        System.out.println("----------------------------------");

        // 2-Тапсырма
        System.out.println("2-Тапсырма: Санның 3-ке және 5-ке бөлінуін тексеру");
        System.out.print("Бүтін сан енгізіңіз: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Сан 3-ке де, 5-ке де бөлінеді.");
        } else if (num % 3 == 0) {
            System.out.println("Сан 3-ке бөлінеді.");
        } else if (num % 5 == 0) {
            System.out.println("Сан 5-ке бөлінеді.");
        } else {
            System.out.println("Сан 3-ке де, 5-ке де бөлінбейді.");
        }

        System.out.println("----------------------------------");

        // ---------------- SWITCH-CASE ----------------
        System.out.println("3-Тапсырма: Ай атауын шығару");
        System.out.print("Ай нөмірін енгізіңіз (1-12): ");
        int month = sc.nextInt();

        switch(month) {
            case 1: System.out.println("Қаңтар"); break;
            case 2: System.out.println("Ақпан"); break;
            case 3: System.out.println("Наурыз"); break;
            case 4: System.out.println("Сәуір"); break;
            case 5: System.out.println("Мамыр"); break;
            case 6: System.out.println("Маусым"); break;
            case 7: System.out.println("Шілде"); break;
            case 8: System.out.println("Тамыз"); break;
            case 9: System.out.println("Қыркүйек"); break;
            case 10: System.out.println("Қазан"); break;
            case 11: System.out.println("Қараша"); break;
            case 12: System.out.println("Желтоқсан"); break;
            default: System.out.println("Қате ай нөмірі!");
        }

        System.out.println("----------------------------------");

        // 4-Тапсырма: Калькулятор
        System.out.println("4-Тапсырма: Қарапайым калькулятор");
        System.out.print("Бірінші санды енгізіңіз: ");
        double a = sc.nextDouble();

        System.out.print("Амал таңбасын енгізіңіз (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Екінші санды енгізіңіз: ");
        double b = sc.nextDouble();

        switch(op) {
            case '+':
                System.out.println("Нәтиже: " + (a + b));
                break;
            case '-':
                System.out.println("Нәтиже: " + (a - b));
                break;
            case '*':
                System.out.println("Нәтиже: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Нәтиже: " + (a / b));
                } else {
                    System.out.println("Қате! 0-ге бөлуге болмайды.");
                }
                break;
            default:
                System.out.println("Қате амал таңбасы!");
        }

        sc.close();
    }
}