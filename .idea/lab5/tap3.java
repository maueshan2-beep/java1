import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Апта күнінің нөмірін енгізіңіз (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Дүйсенбі");
                break;
            case 2:
                System.out.println("Сейсенбі");
                break;
            case 3:
                System.out.println("Сәрсенбі");
                break;
            case 4:
                System.out.println("Бейсенбі");
                break;
            case 5:
                System.out.println("Жұма");
                break;
            case 6:
                System.out.println("Сенбі");
                break;
            case 7:
                System.out.println("Жексенбі");
                break;
            default:
                System.out.println("Қате нөмір енгізілді!");
        }

        sc.close();
    }
}
