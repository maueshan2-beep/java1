public class tap7 {
    static class Outer {
        class Inner {
            void show() {
                System.out.println("Hello from Inner class");
            }
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}