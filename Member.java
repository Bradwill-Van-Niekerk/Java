public class Member extends User {
    public Member(String name) {
        super(name);
    }

    @Override
    public void borrowBook(Book book) {
        try {
            book.borrowBook();
            System.out.println("Book borrowed successfully by " + name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
