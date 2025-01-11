/**
 * 5. Define a functional interface Calculator with a method int calculate(int a, int b). Use lambdas to
 * implement this interface for:
 *
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Test these implementations with various inputs.
 */
import java.util.Scanner;

public class Ex_5_Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int x = userInput.nextInt();
        System.out.println("Enter number b: ");
        int y = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Enter operation '+' or '-' or '*' or '/' ): ");
        char operation = userInput.nextLine().charAt(0);

        switch (operation){
            case '+' -> System.out.println(addition(x,y));
            case '-' -> System.out.println(substraction(x,y));
            case '*' -> System.out.println(multiply(x,y));
            case '/' -> System.out.println(division(x,y));
            default -> System.out.println("Default");
        }

    }
    public static int addition(int x, int y){
        Computable add = (a,b) -> a+b;
        int sum = add.compute(x,y);
        return sum;
    }
    public static int substraction (int x, int y){
        Computable substraction = (a,b) -> a-b;
        int sub = substraction.compute(x,y);
        return sub;
    }

    public static int multiply(int x, int y){
        Computable multiply = (a,b) -> a*b;
        int mul = multiply.compute(x,y);
        return mul;
    }

    public static int division(int x, int y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        } else {
            Computable division = (a, b) -> a / b;
            int div = division.compute(x, y);
            return div;
        }
    }

    interface Computable {
        int compute(int a, int b);
    }
}
