package exercitii;

public class SellTransactions {
    // SellTransaction atributes.
    private int transactionID;
    private String transactionCustomer;
    private String transactionCarMake;
    private int transactionCarYear;
    private int transactionPrice;
    private boolean transactionIsValid;

    //SellTransaction getters

    public int getTransactionID(int i) {
        return transactionID;
    }

    public String getTransactionCustomer() {
        return transactionCustomer;
    }

    public String getTransactionCarMake() {
        return transactionCarMake;
    }

    public int getTransactionCarYear() {
        return transactionCarYear;
    }

    public int getTransactionPrice() {
        return transactionPrice;
    }

    public boolean isTransactionIsValid(boolean b) {
       return transactionIsValid;
    }

// SellTransactions setters:
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public void setTransactionCustomer(String transactionCustomer) {
        this.transactionCustomer = transactionCustomer;
    }

    public void setTransactionCarMake(String transactionCarMake) {
        this.transactionCarMake = transactionCarMake;
    }

    public void setTransactionCarYear(int transactionCarYear) {
        this.transactionCarYear = transactionCarYear;
    }

    public void setTransactionPrice(int transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public void setTransactionIsValid(boolean transactionIsValid) {
        this.transactionIsValid = transactionIsValid;
    }

    // SellTransactions constructors- one empty, one with three atributes required and one with all attributes required

    public SellTransactions() {
    }

    public SellTransactions(int transactionID, String transactionCustomer, String transactionCarMake) {
        this.transactionID = transactionID;
        this.transactionCustomer = transactionCustomer;
        this.transactionCarMake = transactionCarMake;
    }

    public SellTransactions(int transactionID, String transactionCustomer, String transactionCarMake, int transactionCarYear, int transactionPrice, boolean transactionIsValid) {
        this.transactionID = transactionID;
        this.transactionCustomer = transactionCustomer;
        this.transactionCarMake = transactionCarMake;
        this.transactionCarYear = transactionCarYear;
        this.transactionPrice = transactionPrice;
        this.transactionIsValid = transactionIsValid;
    }

    public void showTransactionDetail() {
        if (transactionIsValid) {
            System.out.println( "Validated transaction ID: " + transactionID +
                                " Customer " + transactionCustomer +
                                " buys car of make " + transactionCarMake +
                                " built in  " + transactionCarYear +
                                " at price " + transactionPrice);
        } else {
            System.out.println("Cannot print invalid transaction details.");
        }
    }
}
