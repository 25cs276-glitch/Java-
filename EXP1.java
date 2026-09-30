class Book {

    int bookId;
    String author;
    String category;
    double price;
    boolean available;
    String title;

    // Parameterized Constructor
    Book(int bookId, String author, String title,
         String category, double price, boolean available) {

        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("BookId: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

class Main {

    public static void main(String[] args) {

        Book b1 = new Book(
            101,
            "Shakespeare",
            "Cave away",
            "optimistic",
            2000,
            false
        );

        Book b2 = new Book(
            102,
            "Tony",
            "Jasmin",
            "Crazy",
            4000,
            true
        );

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}