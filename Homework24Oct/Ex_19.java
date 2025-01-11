//20. Write a recursive method to generate the Fibonacci sequence up
// to a given number of terms.

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number  of terms: ");
        int terms = userInput.nextInt();

        for(int i =0; i< terms; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    private static int fibonacci(int i) {
        if(i<=1){
            return i;
        } else{
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }
}


