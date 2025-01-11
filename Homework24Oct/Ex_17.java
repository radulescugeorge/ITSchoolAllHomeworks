import java.util.Scanner;

// Write a method that takes two integers as parameters and returns
// the maximum of the two.
public class Ex_17 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = userInput.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = userInput.nextInt();

        System.out.println("The greatest number is "+ compareTheTwoNumbers(firstNumber, secondNumber));

    }

    private static int compareTheTwoNumbers(int a, int b) {
        if(a>b){
            return a;
        } else {
            return b;
        }
    }
}
