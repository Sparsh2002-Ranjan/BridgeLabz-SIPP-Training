class Book {
    static String libraryName = "National Digital Library";

    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; 
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("-------------------------");
    }
}

public class Library {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("The Java Handbook", "Patrick Naughton", "ISBN001");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "ISBN002");

        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }

        if (book2 instanceof Book) {
            book2.displayBookDetails();
        }
    }
}
