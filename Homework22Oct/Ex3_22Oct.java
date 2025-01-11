//3. Perform various string manipulations using methods. (count vowels and reverse string);
//Ex.3 sesiune 22 0ct. George Radulescu

import java.util.Scanner;

public class Ex3_22Oct {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter word: ");
        String myString = userInput.nextLine();
        char[] strArray =  myString.toCharArray();

        int cntVowels = countVowels(strArray);
        System.out.println("It has "+cntVowels+" vowels.");

        printArrayInReverse(strArray);
    }

    private static void printArrayInReverse(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
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
