public class tap2 {
    static class Student {
        String name;
        static String university = "KazNU";

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println(name + " studies at " + university);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ali");
        s1.display();
    }
}