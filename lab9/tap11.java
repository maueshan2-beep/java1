public class tap11 {
    static class Car {
        class Engine {
            int power;

            Engine(int power) {
                this.power = power;
            }

            void show() {
                System.out.println("Power: " + power + " HP");
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine(150);
        engine.show();
    }
}