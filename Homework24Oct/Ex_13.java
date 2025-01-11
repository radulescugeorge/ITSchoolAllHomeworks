//14. Write a program that counts the number of vowels in a given string.

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter string: ");
        String userString = userInput.nextLine();

        char[] strArray = userString.toCharArray();
        int cntVowels = countVowels(strArray);
        System.out.println("It has " + cntVowels + " vowels.");
    }

    private static int countVowels(char[] array) {
        int nrVowels = 0;
        for (char c : array) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                nrVowels++;
            }
        }
        return nrVowels;
    }
}
