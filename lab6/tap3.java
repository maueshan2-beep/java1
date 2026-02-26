import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > -4 && x <= 5)
            f = Math.cbrt(Math.pow(x,2) + 3) + 6*Math.pow(x,2);
        else if (x > 0)
            f = Math.pow(x,5) + 3.5;
        else
            f = 0;

        System.out.println("f(x) = " + f);
    }
}