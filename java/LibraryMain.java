// Demonstrates adding and listing books in a simple library class.
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Java Programming", "James Gosling", "123-456-789");
        Book book2 = new Book("Python Basics", "Guido van Rossum", "987-654-321");
        Book book3 = new Book("Discrete Maths", "Rosen", "145-666-921");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAllBooks();
    }
}

