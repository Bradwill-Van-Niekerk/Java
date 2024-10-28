import java.util.ArrayList;

public class Librarian extends User {
    private ArrayList<Book> libraryBooks;

    public Librarian(String name, ArrayList<Book> libraryBooks) {
        super(name);
        this.libraryBooks = libraryBooks;
    }

    public void addBook(String title, String author) {
        libraryBooks.add(new Book(title, author));
        System.out.println("Book added to library by librarian " + name);
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println("Book returned successfully to the library.");
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Librarian " + name + " cannot borrow books.");
    }
}
