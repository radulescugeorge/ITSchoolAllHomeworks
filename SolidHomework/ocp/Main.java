package ocp;

/**
 * Refactor the DiscountCalculator class to follow OCP using interfaces or abstract classes.
 * Add a new customer type (e.g., "Student") without modifying the existing logic.
 */
public class Main {

    public static void main(String[] args) {

        Discount myDiscount = new Discount();
        DiscountCalculator myDC = new DiscountCalculator();

       System.out.println("Discount is : " + myDC.calculateDiscount(1000, "Student", myDiscount));


    }

}

// creeaza clasa abstract pentru calcul discount
// si apoi clase separate pentru Student, regular, etc.
