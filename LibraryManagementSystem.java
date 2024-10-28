import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private ArrayList<Book> books = new ArrayList<>();

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem library = new LibraryManagementSystem();
        Librarian librarian = new Librarian("Alice", library.books);
        Member member = new Member("Bob");

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book (Librarian Only)");
            System.out.println("2. Show Books");
            System.out.println("3. Borrow Book (Member Only)");
            System.out.println("4. Return Book (Librarian Only)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    librarian.addBook(title, author);
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    Book bookToBorrow = library.findBook(borrowTitle);
                    if (bookToBorrow != null) {
                        member.borrowBook(bookToBorrow);
                    }
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    Book bookToReturn = library.findBook(returnTitle);
                    if (bookToReturn != null) {
                        librarian.returnBook(bookToReturn);
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
