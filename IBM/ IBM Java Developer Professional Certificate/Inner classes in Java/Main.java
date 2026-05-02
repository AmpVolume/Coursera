public class Main {

    // =========================
    // 1. Outer + Inner Class
    // =========================
    static class OuterClass {
        int outerVariable = 10;

        class InnerClass {
            void display() {
                System.out.println("Outer variable value: " + outerVariable);
            }
        }
    }

    // =========================
    // 2. Static Nested Class
    // =========================
    static class OuterClassStatic {
        static int staticVariable = 20;

        static class StaticNestedClass {
            void show() {
                System.out.println("Static variable value: " + staticVariable);
            }
        }
    }

    // =========================
    // 3. Method-Local Inner Class
    // =========================
    static class OuterClassMethod {
        void myMethod() {
            class MethodLocalInner {
                void display() {
                    System.out.println("Inside Method Local Inner Class");
                }
            }

            MethodLocalInner inner = new MethodLocalInner();
            inner.display();
        }
    }

    // =========================
    // 4. Anonymous Inner Class
    // =========================
    interface Greeting {
        void greet();
    }

    // =========================
    // 5. Real-World Example
    // =========================
    static class Library {
        private String libraryName;

        public Library(String name) {
            this.libraryName = name;
        }

        class Book {
            private String title;
            private String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public void displayBookInfo() {
                System.out.println("Library: " + libraryName);
                System.out.println("Book Title: " + title);
                System.out.println("Author: " + author);
            }
        }
    }

    // =========================
    // MAIN METHOD (runs everything)
    // =========================
    public static void main(String[] args) {

        // Inner Class Example
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        System.out.println("-----");

        // Static Nested Class Example
        OuterClassStatic.StaticNestedClass nested =
                new OuterClassStatic.StaticNestedClass();
        nested.show();

        System.out.println("-----");

        // Method-Local Inner Class Example
        OuterClassMethod methodExample = new OuterClassMethod();
        methodExample.myMethod();

        System.out.println("-----");

        // Anonymous Inner Class Example
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greeting.greet();

        System.out.println("-----");

        // Real-World Example
        Library myLibrary = new Library("City Library");
        Library.Book myBook =
                myLibrary.new Book("1984", "George Orwell");
        myBook.displayBookInfo();
    }
}
