
// Write methods to calculate the area of a circle, rectangle, and triangle.
// Call these methods in the main program to compute areas for different inputs.

import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        menuShow();
        char menuChoice = userInput.nextLine().charAt(0);
        switch(menuChoice){
            case'c' -> circleArea();
            case'r' -> rectangleArea();
            case't' -> triangleArea();
            default -> System.out.println("You must choose either 'c' or 'r' or 't'...");
        }
    }

    private static void triangleArea() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter triangle base length: ");
        int tBase = userInput.nextInt();
        System.out.print("Enter triangle height length: ");
        int tHeight = userInput.nextInt();
        int tArea = (tBase*tHeight)/2;
        System.out.println("Triangle area is " + tArea);
    }

    private static void rectangleArea() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter rectangle length: ");
        int rLength = userInput.nextInt();
        System.out.print("Enter rectangle width: ");
        int rWidth = userInput.nextInt();
        int rArea = rWidth * rLength;
        System.out.println("Rectangle area is " + rArea);
    }

    private static void circleArea() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        int cRadius = userInput.nextInt();
        double cArea = 3.14159*cRadius*cRadius;
        System.out.println("Circle area is " + cArea);
    }

    public static void menuShow(){
        System.out.println("=     Choose :    =");
        System.out.println("= c - Circle      =");
        System.out.println("= r - Rectangle   =");
        System.out.println("= t - Triangle    =");
        System.out.print("Enter choice: ");

    }
}
