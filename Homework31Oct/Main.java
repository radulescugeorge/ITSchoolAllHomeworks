/* I've created three clases : Cars Customers and transactions. Basically a transaction object is updated with data from cars and customers objects.
Cars is defined with a private constructor and the single object is defined inside the class
 */

package exercitii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instantiate Customers and transactions clasess
        Customers firstCustomer = new Customers("John", "Bucharest", 25, 15000, false);
        SellTransactions firstSale = new SellTransactions(); // we will instantiate to default values, because we will update them later

        Scanner userInput = new Scanner(System.in);


        if(firstCustomer.getAge() < 18 || firstCustomer.getAmount() < CarsPrivate.getPrice()){ // test some condition if transaction is valid
            // if not say to user;
            System.out.println("Invalid transaction. Please check if customer has legal age and if customer has all the funds required to buy the car.");
            System.out.println("Auto = " + CarsPrivate.getMake() + " " + CarsPrivate.getModel() + " " + CarsPrivate.getYear() + " at price " + CarsPrivate.getPrice() + " is used ? " + CarsPrivate.isIsUsed());
            firstCustomer.showCustomerDetails();
        } else {
            // if it's ok, update SellTransaction instance/entity with values from user and some values already stored for car and customer;
            firstSale.setTransactionIsValid(true);

            System.out.print("Enter valid transaction ID: "); // get transaction id
            firstSale.setTransactionID(userInput.nextInt());
            firstSale.setTransactionCarMake(CarsPrivate.getMake());
            firstSale.setTransactionCustomer(firstCustomer.getName());
            firstSale.setTransactionCarYear(CarsPrivate.getYear());
            firstSale.setTransactionPrice(CarsPrivate.getPrice());
// and then print everything


            System.out.println("Auto = " + CarsPrivate.getMake() + " " + CarsPrivate.getModel() + " " + CarsPrivate.getYear() + " at price " + CarsPrivate.getPrice() + " is used ? " + CarsPrivate.isIsUsed());
            firstCustomer.showCustomerDetails();
            firstSale.showTransactionDetail();
        }
    }
}
