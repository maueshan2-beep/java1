import java.util.Scanner;

public class tap5 {

    // Тапсырма 1: Кесінді функция (қарапайым if-else)
    public static double piecewiseSimple(double x) {

        if (x < 0) {
            return x * x;          // x^2
        }
        else if (x >= 0 && x < 1) {
            return x + 2;          // мысал ретінде x + 2
        }
        else {
            return 2 * x;          // 2x
        }
    }

    // Тапсырма 2: Math функцияларымен кесінді функция
    public static double piecewiseMath(double x) {

        if (x < 0) {
            return x * x;                    // x^2
        }
        else if (x >= 0 && x < 1) {
            return Math.sin(x);              // sin(x)
        }
        else {
            return Math.cos(x) + Math.tan(x); // cos(x) + tan(x)
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        // Тапсырма 1 нәтижесі
        double result1 = piecewiseSimple(x);
        System.out.println("Кесінді функция (if-else) нәтижесі: " + result1);

        // Тапсырма 2 нәтижесі
        double result2 = piecewiseMath(x);
        System.out.println("Math функцияларымен нәтиже: " + result2);

        sc.close();
    }
}