package projectone;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

class Patron {
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void borrowBook(Patron patron, Book book) {
        if (book.isAvailable()) {
            System.out.println(patron.getName() + " has borrowed " + book.getTitle());
            book.setAvailable(false);
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Patron patron, Book book) {
        if (!book.isAvailable()) {
            System.out.println(patron.getName() + " has returned " + book.getTitle());
            book.setAvailable(true);
        } else {
            System.out.println("Error: " + book.getTitle() + " is already available in the library.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayPatrons() {
        System.out.println("Library Patrons:");
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        Patron patron1 = new Patron("John Doe");
        Patron patron2 = new Patron("Jane Doe");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addPatron(patron1);
        library.addPatron(patron2);

        library.displayBooks();
        library.displayPatrons();

        library.borrowBook(patron1, book1);
        library.borrowBook(patron2, book1);

        library.displayBooks();

        library.returnBook(patron1, book1);
        library.returnBook(patron2, book1);

        library.displayBooks();
    }
}
