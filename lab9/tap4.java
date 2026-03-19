public class tap4 {
    static class Counter {
        static int count = 0;

        static void increment() {
            count++;
        }
    }

    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println(Counter.count);
    }
}