import java.util.Scanner;
public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x < 1.22)
            f = x*Math.cos(x);
        else
            f = 5*Math.pow(x,3) + 1.7;

        System.out.println("f(x) = " + f);
    }
}