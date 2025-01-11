import java.util.Scanner;

//5. Write a program that takes a single letter as input and uses a switch statement
// to determine if it’s a vowel (a, e, i, o, u) or a consonant.
// If it’s not a letter, display "Invalid input."
// Tema George Radulescu 12 oct

public class Vowels {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter letter (Only the first character is read in console): ");

        char letter = userinput.next().charAt(0);

        switch (letter){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(letter + " is Vowel");
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 'q', 's', 't', 'x', 'y', 'z', 'B',
                 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'Q', 'S',
                 'T', 'X', 'Y', 'Z' -> System.out.println(letter+ " is Consonant");
            default -> System.out.println(letter + "is Not a letter");
        }
    }
}
