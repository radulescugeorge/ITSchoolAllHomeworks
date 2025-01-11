//17. Write a program to compare two strings and
// check if they are equal (case-sensitive and case-insensitive).

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = userInput.nextLine();
        System.out.print("Enter second string: ");
        String secondString = userInput.nextLine();

        //boolean stringAreEqual = false;
        if(secondString.compareTo(firstString)==0){
            System.out.println("Compare case sensitive: Are equal");
        } else {
            System.out.println("Compare case sensitive: Not equal");
        }
        if(secondString.compareTo(firstString.toLowerCase())==0){
            System.out.println("Compare case insensitive: Are equal");
        } else {
            System.out.println("Compare case insensitive: Not equal");
        }

    }
}
