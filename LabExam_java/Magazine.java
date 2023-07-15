public class Magazine extends LibraryItem {
    private String issueNumber;
    private String publicationMonth;
    private boolean borrowed;

    public Magazine(String title, String issueNumber, String publicationMonth) {
        super(title);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
        this.borrowed = false;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationMonth() {
        return publicationMonth;
    }

    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("The magazine '" + getTitle() + "' has been borrowed.");
        } else {
            System.out.println("The magazine '" + getTitle() + "' is already borrowed.");
        }
    }
}
