import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        // Создание объекта Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Ввод длины прямоугольника
        System.out.print("Введите длину прямоугольника: ");
        double a = scanner.nextDouble();

        // Ввод ширины прямоугольника
        System.out.print("Введите ширину прямоугольника: ");
        double b = scanner.nextDouble();

        // Вычисление площади
        double area = a * b;

        // Вычисление периметра
        double perimeter = 2 * (a + b);

        // Вывод результатов
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}