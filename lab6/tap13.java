import java.util.Scanner;
public class tap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 1 && x <= 3)
            f = Math.sin(5*x) * Math.sqrt(1 + Math.pow(x,2) + Math.pow(Math.log(x),2));
        else
            f = Math.exp(x) * Math.cbrt(x + Math.exp(2*x));

        System.out.println("f(x) = " + f);
    }
}