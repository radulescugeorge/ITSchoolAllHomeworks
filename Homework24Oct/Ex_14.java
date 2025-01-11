//15. Create a program that reverses a string without using the built-in reverse function.

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter word: ");
        String myString = userInput.nextLine();
        char[] strArray =  myString.toCharArray();

        printArrayInReverse(strArray);
    }

    private static void printArrayInReverse(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
