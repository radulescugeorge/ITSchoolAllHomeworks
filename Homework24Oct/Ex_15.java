//16. Write a program to count the number of characters (excluding spaces) in a string.

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter words: ");
        String initString = userInput.nextLine();

        System.out.println("String has " + countCharsOfString(initString) + " characters");

    }

    private static int countCharsOfString(String String) {
        int count = 0;
        char[] stringChars = String.toCharArray();
        for (int i=0; i< String.length(); i++) {
            if (stringChars[i] != ' ') {
                count++;
            }
        }
        return count;
    }
}
