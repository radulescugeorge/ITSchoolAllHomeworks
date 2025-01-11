package library2;

public class Book {
    private final String title;
    private final String author;
    private final String year;
    private boolean  isBorrowed;

    private Member member;
    private final Transaction[] bookMovements = new Transaction[100];
    int movmentcounter = 0;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public Member getMember() {
        return member;
    }

    public void printBookDetails() {
        System.out.println("--------------------");
        System.out.println("Book details: ");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Year: " + this.getYear());
    }

    public void loanBook(String member, String title) {
        if(!isBorrowed) {
            Transaction trans1 = Transaction.borrowBookTransaction(member, title);
            bookMovements[movmentcounter++] = trans1;
            isBorrowed = true;
        } else {
            System.out.println("Cannot borrow a book already borrowed.");
        }
    }

    public void returnBook(String member, String title) {
        if(isBorrowed){
            Transaction trans1 = Transaction.returnBookTransaction(member, title);
            bookMovements[movmentcounter++] = trans1;
            isBorrowed = false;
        } else {
            System.out.println("Cannot return a book if already in library.");
        }

    }

    public void printBookMovements() {
        System.out.println("---------------------------------");
        System.out.println("Book title: " + title);
        System.out.println("Movements: ");
        System.out.println("---------------------------------");
        for (int i = 0; i < movmentcounter; i++) {
            Transaction transaction = bookMovements[i];
            System.out.println(" - Member: " + transaction.getToMember() + " has " + transaction.getDetails() + " the book.");
        }
        System.out.println("---------------------------------");
    }
}
