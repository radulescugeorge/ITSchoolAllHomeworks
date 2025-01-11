import java.util.Scanner;

//7. Write a program that asks the user for a positive integer and uses a while loop to find
// the factorial of that number.
// Display the result.
// Tema George Radulescu 12 oct

public class FactorialWhile {
    public static void main(String[] args) {
        int var1 = 2;
        long fact;
        int k = 1;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter number to compute factorial : ");
        try {
            var1 = userinput.nextInt();
            fact = var1;
            if (var1 < 2) {
                System.out.println("Number must be positive and above 2. For 0 and 1 factorial is 1.");
            } else {
                while (k < var1) {
                    fact = fact * (var1 - k);
                    k++;
                }
                System.out.println("Factorial of number: " + var1 + " is " + fact);
            }
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Error: " + e);
        }
    }
}
