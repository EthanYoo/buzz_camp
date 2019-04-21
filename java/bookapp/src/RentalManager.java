import java.util.ArrayList;

public class RentalManager {
    private ArrayList<Rental> list = new ArrayList<>();

    public void rentBook(User user, Book book) {
        list.add(new Rental(user, book));
    }

    public void returnBook(User user, Book book) {
        for (Rental rental : list) {
            if (rental.getUser() == user && rental.getBook() == book) {
                list.remove(rental);
                break;
            }
        }
    }

    public void printRentalList() {
        for (Rental rental : list) {
            System.out.println(rental);
        }
    }
}
