import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-тапсырма:");
        task1(sc);
        System.out.println("\n2-тапсырма:");
        task2(sc);
        System.out.println("\n3-тапсырма:");
        task3(sc);
        System.out.println("\n4-тапсырма:");
        task4(sc);
        System.out.println("\n5-тапсырма:");
        task5(sc);
        System.out.println("\n6-тапсырма:");
        task6(sc);
        System.out.println("\n7-тапсырма:");
        task7(sc);
        System.out.println("\n8-тапсырма:");
        task8(sc);
        System.out.println("\n9-тапсырма:");
        task9(sc);
        System.out.println("\n10-тапсырма:");
        task10(sc);
    }

    // 1. f(x) = - sin(x) / (x + 3) + x^2 / 2 + π / 17
    static void task1(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = -Math.sin(x) / (x + 3) + Math.pow(x, 2)/2 + Math.PI/17;
        System.out.println("f(x) = " + y);
    }

    // 2. f(x) = ln(x) - 1.5 + 4x^5 + 4x^3 + 3
    static void task2(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = Math.log(x) - 1.5 + 4*Math.pow(x,5) + 4*Math.pow(x,3) + 3;
        System.out.println("f(x) = " + y);
    }

    // 3. f(x) = tg(x) + ln(x) + x^3 / 5 + x^2 / 3
    static void task3(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = Math.tan(x) + Math.log(x) + Math.pow(x,3)/5 + Math.pow(x,2)/3;
        System.out.println("f(x) = " + y);
    }

    // 4. f(x) = cos(5x) + x^2 + 2 - x
    static void task4(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = Math.cos(5*x) + Math.pow(x,2) + 2 - x;
        System.out.println("f(x) = " + y);
    }

    // 5. f(x) = x + ln(x) + x^2 - x
    static void task5(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = x + Math.log(x) + Math.pow(x,2) - x;
        System.out.println("f(x) = " + y);
    }

    // 6. f(x) = x + x^2 + x/5 + x%2 + e^x
    static void task6(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = x + Math.pow(x,2) + x/5 + (x % 2) + Math.exp(x);
        System.out.println("f(x) = " + y);
    }

    // 7. f(x) = x % 6 + x * ln(x)
    static void task7(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = (x % 6) + x * Math.log(x);
        System.out.println("f(x) = " + y);
    }

    // 8. f(x) = x + x^3/4 + sin(x) + tg(x)
    static void task8(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = x + Math.pow(x,3)/4 + Math.sin(x) + Math.tan(x);
        System.out.println("f(x) = " + y);
    }

    // 9. f(x) = e^x + x^4/3 + cos(x) + ln(x) + x^7/3
    static void task9(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = Math.exp(x) + Math.pow(x,4)/3 + Math.cos(x) + Math.log(x) + Math.pow(x,7)/3;
        System.out.println("f(x) = " + y);
    }

    // 10. f(x) = ln(5x) + x*sin(x) + tg(x)
    static void task10(Scanner sc) {
        System.out.print("x = ");
        double x = sc.nextDouble();
        double y = Math.log(5*x) + x*Math.sin(x) + Math.tan(x);
        System.out.println("f(x) = " + y);
    }
}
