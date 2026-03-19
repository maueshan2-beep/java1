public class tap1 {
    static class Student {
        String name;
        int age;
        static int count = 0;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
            count++;
        }
    }

    public static void main(String[] args) {
        new Student("Ali", 18);
        new Student("Aruzhan", 19);

        System.out.println("Students count: " + Student.count);
    }
}