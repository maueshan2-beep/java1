public class tap14 {
    static class Course {
        String courseName;

        Course(String courseName) {
            this.courseName = courseName;
        }

        class Student {
            String name;

            Student(String name) {
                this.name = name;
            }

            void show() {
                System.out.println(name + " in " + courseName);
            }
        }
    }

    public static void main(String[] args) {
        Course c = new Course("Java");
        Course.Student s = c.new Student("Ali");
        s.show();
    }
}