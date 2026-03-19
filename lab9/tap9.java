public class tap9 {
    static class Computer {
        class Processor {
            double frequency;

            Processor(double frequency) {
                this.frequency = frequency;
            }

            void show() {
                System.out.println("Frequency: " + frequency + " GHz");
            }
        }
    }

    public static void main(String[] args) {
        Computer c = new Computer();
        Computer.Processor p = c.new Processor(3.5);
        p.show();
    }
}