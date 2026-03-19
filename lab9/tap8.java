public class tap8 {
    static class University {
        class Student {
            String name;
            String major;

            Student(String name, String major) {
                this.name = name;
                this.major = major;
            }

            void display() {
                System.out.println(name + " - " + major);
            }
        }
    }

    public static void main(String[] args) {
        University u = new University();
        University.Student s = u.new Student("Ali", "IT");
        s.display();
    }
}