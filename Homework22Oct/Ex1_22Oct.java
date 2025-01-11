//1. Create a basic calculator that performs addition, subtraction, multiplication, and division using methods.
//Ex.1 sesiune 22 0ct. George Radulescu

import java.util.Scanner;

public class Ex1_22Oct {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter First Number");
        int nr1 = userInput.nextInt();
        System.out.print("Enter second number");
        int nr2 = userInput.nextInt();
        System.out.println("Enter operation as + or - or * or / to be performed: ");
        String op = userInput.next();

        int result = 0;

        switch (op) {
            case "+" -> result = adunare(nr1, nr2);
            case "-" -> result = scadere(nr1, nr2);
            case "*" -> result = inmultire(nr1, nr2);
            case "/" -> result = impartire(nr1, nr2);
            default -> System.out.println("Not a recongnizable operation");
        }
        System.out.println(result);

    }

    private static int impartire(int a, int b) {
        if (b == 0) {
            System.out.println("Second number is 0. Cannot divide by zero");
            return 0;
        } else {
            return a / b;
        }
    }

    private static int inmultire(int a, int b) {
        return a * b;
    }

    private static int scadere(int a, int b) {
        return a - b;
    }

    private static int adunare(int a, int b) {
        return a + b;
    }
}