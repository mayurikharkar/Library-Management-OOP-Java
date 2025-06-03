import java.util.ArrayList;
import java.util.Scanner;

// Abstract Book class (Abstraction)
abstract class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Encapsulation - getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Abstract method to show book details (Polymorphism)
    public abstract void showDetails();
}

// Concrete class extending Book (Inheritance)
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void showDetails() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + " | Genre: " + genre + " | Borrowed: " + isBorrowed());
    }
}

class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void showDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() + " | Subject: " + subject + " | Borrowed: " + isBorrowed());
    }
}

public class LibrarySystem {
    private ArrayList<Book> books;
    private Scanner scanner;

    public LibrarySystem() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Add books to library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        for (Book b : books) {
            b.showDetails();
        }
    }

    // Search book by title or author
    public void searchBooks() {
        System.out.print("Enter title or author to search: ");
        String query = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(query) || b.getAuthor().toLowerCase().contains(query)) {
                b.showDetails();
                found = true;
            }
        }
        if (!found) System.out.println("No books found matching query.");
    }

    // Borrow book
    public void borrowBook() {
        System.out.print("Enter title of book to borrow: ");
        String title = scanner.nextLine();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.borrow();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return book
    public void returnBook() {
        System.out.print("Enter title of book to return: ");
        String title = scanner.nextLine();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Menu for user input
    public void start() {
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Fiction Book");
            System.out.println("2. Add Non-Fiction Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("Choose option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    addBook(new FictionBook(title, author, genre));
                }
                case 2 -> {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();
                    addBook(new NonFictionBook(title, author, subject));
                }
                case 3 -> displayBooks();
                case 4 -> searchBooks();
                case 5 -> borrowBook();
                case 6 -> returnBook();
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    // Main method to run the system
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.start();
    }
}
