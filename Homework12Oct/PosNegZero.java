//1. Write a program that takes an integer input from the user and checks if it is positive,
// negative, or zero. Display a message indicating the result.
// Tema George Radulescu 12 oct

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            int number = userinput.nextInt();
            if(number < 0){
                System.out.println("Number is negative.");
            } else if (number == 0){
                System.out.println("You've entered zero.");
            } else{
                System.out.println("Number is positive.");
            }
        } catch (Exception e) {
            System.out.println("Check if you've entered an integer. Only integers accepted here.");
        }
    }
}
