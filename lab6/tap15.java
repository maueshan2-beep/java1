import java.util.Scanner;
public class tap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 1 && x <= 3)
            f = Math.pow(Math.pow(x,3) + Math.sin(Math.PI*x) + Math.log(x), 0.25);
        else
            f = Math.cbrt(1.5*Math.pow(x,2) - Math.exp(2*x))
                    + Math.pow(Math.log(x),3);

        System.out.println("f(x) = " + f);
    }
}