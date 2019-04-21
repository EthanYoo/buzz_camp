public class BookApp {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.printBooks();

        // 도서 추가 하고 싶을 때
        bookManager.addBook(new Book("Buzzvil Culture", "Young", 10000));
        bookManager.addBook(new Book("BuzzCamp", "Ethan", 5000));
        bookManager.addBook(new Book("SPD", "Bling", 20000));
        bookManager.printBooks();

        // 도서 삭제 하고 싶을 때
        Book buzzCampBook = bookManager.findBook("BuzzCamp");
        bookManager.removeBook(buzzCampBook);
        bookManager.printBooks();

        UserManager userManager = new UserManager();
        userManager.addUser(new User("Joshua", 23));
        userManager.addUser(new User("Diane", 25));

        RentalManager rentalManager = new RentalManager();
        Book spdBook = bookManager.findBook("SPD");
        User joshuaUser = userManager.findUser("Joshua");

        rentalManager.rentBook(joshuaUser, spdBook);
        rentalManager.printRentalList();

        rentalManager.returnBook(joshuaUser, spdBook);
        rentalManager.printRentalList();
    }
}
