//1. Write a program that checks if a given integer is
// even or odd using an if statement.

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number");
        int givenInteger = userInput.nextInt();
        if(givenInteger%2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
