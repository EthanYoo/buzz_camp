public class Rental {
    private User user;
    private Book book;

    public Rental(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "user=" + user +
                ", book=" + book +
                '}';
    }
}
