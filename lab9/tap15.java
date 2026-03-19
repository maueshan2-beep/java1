public class tap15 {
    static class University {
        static int studentCount = 0;

        class Student {
            String name;

            Student(String name) {
                this.name = name;
                studentCount++;
            }
        }
    }

    public static void main(String[] args) {
        University u = new University();
        u.new Student("Ali");
        u.new Student("Aruzhan");

        System.out.println(University.studentCount);
    }
}