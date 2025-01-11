/*
Homework George Radulescu
Calculate the area and circumference of a circle given its radius;
 */

public class Circle {
    public static void main(String[] args) {
        double radius = 3;
        double pi = 3.141;
        System.out.println("Circumferinta cercului este:" + (2*pi*radius));
        System.out.println("Aria cercului este : " + (pi*(radius*radius)));
    }
}
