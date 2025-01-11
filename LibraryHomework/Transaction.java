package library2;

public class Transaction {

    private final String borrowedBookTitle;
    private final String toMember;
    private final String details;

    private Transaction(String borrowedBookTitle, String toMember, String details) {
        this.borrowedBookTitle = borrowedBookTitle;
        this.toMember = toMember;
        this.details = details;
    }

    public String getBorrowedBookTitle() {
        return borrowedBookTitle;
    }

    public String getToMember() {
        return toMember;
    }

    public String getDetails() {
        return details;
    }

    public void prinTransactionDetails() {
        System.out.println("--------------------------------");
        System.out.println("Transaction Details: ");
        System.out.println("Book: " + this.getBorrowedBookTitle());
        System.out.println("Member: " + this.getToMember());
        System.out.println("Details: " + this.getDetails());
    }

    public static Transaction borrowBookTransaction(String toMember, String borrowedBookTitle){
        return new Transaction(borrowedBookTitle, toMember,"Borrowed");
    }

    public static Transaction returnBookTransaction(String toMember, String borrowedBookTitle){
        return  new Transaction(borrowedBookTitle, toMember, "Returned");
    }

}
