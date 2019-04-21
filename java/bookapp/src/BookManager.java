import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> list = new ArrayList<>();

    public void addBook(Book book) {
        list.add(book);
    }
    public void removeBook(Book book) {
        list.remove(book);
    }
    public Book findBook(String title) {
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    public void printBooks() {
        System.out.println("----- BookManager.printBooks -----");
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            System.out.println("제목 : " + book.getTitle() + ", 저자 : " + book.getAuthor() + ", 가격 : " + book.getPrice());
        }
    }
}
