import java.util.Scanner;
public class tap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 2)
            f = Math.cbrt(1.7*x + Math.sin(x));
        else
            f = Math.cos(Math.PI*x) + Math.tan(x);

        System.out.println("f(x) = " + f);
    }
}