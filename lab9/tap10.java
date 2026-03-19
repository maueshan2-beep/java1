public class tap10 {
    static class Library {
        class Book {
            String title;

            Book(String title) {
                this.title = title;
            }

            void show() {
                System.out.println("Book: " + title);
            }
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        Library.Book b = l.new Book("Java Basics");
        b.show();
    }
}