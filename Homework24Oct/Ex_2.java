//2. Write a program that takes three numbers as input
// and prints the largest number using nested if statements.

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = userInput.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = userInput.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = userInput.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Max is " + firstNumber);
        } else if(secondNumber > firstNumber && secondNumber> thirdNumber){
            System.out.println("Max is "+ secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("Max is " + thirdNumber);
        } else {
            if(firstNumber==secondNumber){
                System.out.println("First and second number are equal and largest.");
            } else if(firstNumber==thirdNumber){
                System.out.println("First and third number are equal and largest.");

            } else if(secondNumber == thirdNumber){
                System.out.println("Second and third number are equal and largest.");

            } else{
                System.out.println("All numbers are equal");
            }

        }
    }
}
