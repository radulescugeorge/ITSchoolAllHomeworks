package exercitii;

public class CarsPrivate {
    private static String make;
    private static String model;
    private static int year;
    private static int price;
    private static boolean isUsed;

    // private constructor of class
    private CarsPrivate() {

    }

    // define only getters for this class as a single object


    public static String getMake() {
       make = "Toyota";
        return make;
    }

    public static String getModel() {
        model = "Corolla";
        return model;
    }

    public static int getYear() {
       // year = 2023;
        return year;
    }

    public static int getPrice() {
       // price = 15000;
        return price;
    }

    public static boolean isIsUsed() {
        if (year < 2024) { // test if car is second hand or not by the year was made
            isUsed = true;
        } else {
            isUsed = false;
        }
        return isUsed;
    }

}
