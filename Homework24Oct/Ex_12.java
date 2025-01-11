//13. Write a program to check if a given string is a palindrome.

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        boolean isPalindrome = false;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string1 = userInput.nextLine();
        String stringReversed = "";

        for (int i = string1.length() - 1; i >= 0; i--) {
            stringReversed = stringReversed + string1.charAt(i);
        }
        if(string1.equals(stringReversed)){
            isPalindrome = true;
        }
        System.out.println("The string is a palindrome ? " + isPalindrome);

    }
}
