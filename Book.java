class Book {
    String title;
    String author;
    double price;
    Book() {
        System.out.println("Default Constructor");
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        System.out.println(title + " | " + author + " | " + price);
    }
    Book(String title, String author) {
        System.out.println("Constructor with Title & Author");
        this.title = title;
        this.author = author;
        this.price = 0.0;
        System.out.println(title + " | " + author + " | " + price);
    }
    Book(String title, String author, double price) {
        System.out.println("Constructor with All Fields");
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println(title + " | " + author + " | " + price);
    }
}
class Main3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling");
        Book b3 = new Book("C++ Guide", "Bjarne Stroustrup", 499.99);
    }
}
