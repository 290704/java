package Assignment1;


import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

class BookCollection {
    private ArrayList<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book with ISBN " + isbn + " removed.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class AssignEx5 {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        Book book1 = new Book("The Princess", "Scott Fitzgerald", "5567367338");
        Book book2 = new Book("The Monster King", "Harry potter", "5736363736");
        
        collection.addBook(book1);
        collection.addBook(book2);
        
        System.out.println("\nCurrent Books in Collection:");
        collection.displayBooks();

        collection.removeBook("5567367338");

        System.out.println("\nAfter Removal:");
        collection.displayBooks();
    }
}
