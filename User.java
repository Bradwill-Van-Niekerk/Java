public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for borrowing a book
    public abstract void borrowBook(Book book);
}
