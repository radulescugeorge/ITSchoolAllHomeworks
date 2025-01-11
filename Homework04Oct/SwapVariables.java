
/* Homework George Radulescu
Write a Java program to swap two variables;
 */

public class SwapVariables {
    public static void main(String[] args) {
        int g = 10;
        int h = 5;
        System.out.println("Before swap : var 1 is " + g + " and var 2 is " + h);
        g = g + h; // g=15
        h = g - h; // h = 10
        g = g - h; // g = 5
        System.out.println("After swap : var 1 is " + g + " and var 2 is " + h);
    }
}
