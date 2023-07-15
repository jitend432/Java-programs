public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        book.borrow();
        book.returnItem();

        Magazine magazine = new Magazine("National Geographic", "May 2023", "May");
        magazine.borrow();
    }
}
