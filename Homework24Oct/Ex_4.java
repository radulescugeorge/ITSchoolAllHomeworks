//4. Write a program to calculate the sum of the first N
// natural numbers using a while loop.

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number tu sum up to: ");
        int number = userInput.nextInt();
        int i = 1;
        int sum = 0;
        while(i<number+1){
            sum = i+sum;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
