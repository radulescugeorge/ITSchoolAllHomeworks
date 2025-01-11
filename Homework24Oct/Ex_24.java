//25. Write a method that checks if a given number is a palindrome (e.g., 121, 12321 are palindromes).
import java.util.Scanner;
public class Ex_24 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number : ");
        String string1 = userInput.nextLine();
        System.out.println("The number " + string1 + " is a palindrome ? " + checkForPalindrome(string1));
    }

    public static boolean checkForPalindrome(String string) {
        boolean isPalindrome = false;
        String stringReversed = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringReversed = stringReversed + string.charAt(i);
        }
        if (string.equals(stringReversed)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
