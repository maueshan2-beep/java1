import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class labo13 {

    // Student классы (14-тапсырма үшін)
    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return name + " " + age + " " + grade;
        }
    }

    public static void main(String[] args) {

        // 1. Лямбда арқылы екі санды қосу
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("1: " + add.apply(5, 3));

        // 2. Жолды бас әріпке түрлендіру
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2: " + toUpper.apply("hello"));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // 3. Тақ сандарды сүзу
        System.out.print("3: ");
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 4. Сандардың квадратын табу
        System.out.print("4: ");
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 5. Ең үлкен элемент
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("5: " + max);

        List<String> words = Arrays.asList("apple", "kiwi", "banana", "pear");

        // 6. Ұзындығына қарай сұрыптау
        System.out.println("6:");
        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        // 7. Бірінші әріпті бас әріпке айналдыру
        System.out.println("7:");
        words.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);

        // 8. Ұзындығы >5 сүзу
        System.out.println("8:");
        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // 9. Method reference
        System.out.println("9:");
        words.forEach(System.out::println);

        // 10. Optional арқылы минимум
        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("10: " + min);

        // 11. Consumer
        System.out.println("11:");
        Consumer<String> printer = x -> System.out.println("Consumer: " + x);
        printer.accept("Hello");

        // 12. Supplier
        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println("12: " + random.get());

        // 13. Comparator.comparing
        System.out.println("13:");
        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        // 14. Student
        List<Student> students = Arrays.asList(
                new Student("SABRINA", 20, 85),
                new Student("MERUERT", 22, 75),
                new Student("ERASYL", 21, 90)
        );

        System.out.println("14:");
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        // 15. Stream chaining
        System.out.println("15:");
        numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        // 16. groupingBy
        System.out.println("16:");
        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));
        System.out.println(grouped);

        // 17. reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("17: " + sum);

        // 18. distinct + limit
        System.out.println("18:");
        Arrays.asList(1,2,2,3,3,4,5).stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // 19. flatMap
        System.out.println("19:");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // 20. Тапсырыстар (Order)
        System.out.println("20:");

        class Order {
            String product;
            int quantity;
            double price;

            Order(String product, int quantity, double price) {
                this.product = product;
                this.quantity = quantity;
                this.price = price;
            }
        }

        List<Order> orders = Arrays.asList(
                new Order("Phone", 1, 500),
                new Order("Laptop", 1, 1000),
                new Order("Mouse", 2, 50)
        );

        double total = orders.stream()
                .map(o -> o.quantity * o.price)
                .reduce(0.0, Double::sum);

        System.out.println("Total: " + total);
    }
}