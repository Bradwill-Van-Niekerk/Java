public class Book {
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() throws Exception {
        if (!isAvailable) {
            throw new Exception("Book is already borrowed.");
        }
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}