public class Book extends LibraryItem {
    private String author;
    private int publicationYear;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        super(title);
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("The book '" + getTitle() + "' has been borrowed.");
        } else {
            System.out.println("The book '" + getTitle() + "' is already borrowed.");
        }
    }

    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("The book '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("The book '" + getTitle() + "' is not currently borrowed.");
        }
    }
}
