package ocp;

public class DiscountCalculator {

    public double calculateDiscount(double price, String customerType, Discount discount) {
       return price*discount.setDiscount(customerType);
    }
}
