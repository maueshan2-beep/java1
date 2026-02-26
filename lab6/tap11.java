import java.util.Scanner;
public class tap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 4)
            f = Math.sin(Math.PI*x) + Math.pow(Math.pow(x,2)+6, 0.2);
        else
            f = Math.log(x) + Math.sqrt(3*x + 7);

        System.out.println("f(x) = " + f);
    }
}