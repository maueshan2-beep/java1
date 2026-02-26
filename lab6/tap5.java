import java.util.Scanner;
public class tap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x < 2)
            f = x*Math.cos(x);
        else if (x >= 2)
            f = 3*Math.pow(x,4) + 7;
        else if (x > 5 && x <= 9)
            f = Math.sqrt(5*Math.pow(x,2) + 1.6);
        else
            f = 0;

        System.out.println("f(x) = " + f);
    }
}
