//2. Create a program that takes an integer and checks if it is divisible by both 2 and 3.
// Print "Divisible by both" if true, "Divisible by only 2" if divisible by 2 but not 3,
// "Divisible by only 3" if divisible by 3 but not 2, and "Not divisible by either" otherwise.
// Tema George Radulescu 12 oct


import java.util.Scanner;

public class DivBy2or3 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int number = userinput.nextInt();
            if (number%2 == 0 && number%3 == 0){
                System.out.println("Divisible by both");
            } else if (number%2 == 0 && number % 3 != 0) {
                System.out.println("Divisible by only 2");
            } else if (number%2 != 0 && number%3 == 0) {
                System.out.println("Divisible by only 3");
            }else {
                System.out.println("Not divisible by either");
            }

        } catch (Exception e) {
            System.out.println("Please enter integer numbers only.");
            System.out.println("Error" + e);
        }
    }
}
