class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // display book info
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class Books {
    public static void main(String[] args) {
        Author author = new Author("Java Basics", 2022, "Sparsh Ranjan", "An experienced Java developer.");
        author.displayInfo();
    }
}
