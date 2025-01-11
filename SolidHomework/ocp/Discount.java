package ocp;

public class Discount {

    public double setDiscount(String customerType){
        switch(customerType){
            case "Regular" -> {
                return 0.05;
            }
            case "VIP" -> {
                return 0.1;
            }
            case "Student" -> {
                return 0.025;
            }
            default -> {
                return 0;
            }
        }
    }
}
