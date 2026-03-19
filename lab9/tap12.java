public class tap12 {
    static class Bank {
        static double interestRate = 0.05;

        static double calculate(double amount) {
            return amount * interestRate;
        }
    }

    public static void main(String[] args) {
        System.out.println(Bank.calculate(1000));
    }
}