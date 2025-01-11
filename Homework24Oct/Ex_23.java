//24. Write a method that checks if a given year is a leap year or not.
// Use this method in the main program to check several year values.

import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter year: ");
        int an = userInput.nextInt();
        System.out.println(an + " este bisect ? " + bisect(an));

    }
    public static boolean bisect(int x){
        if ((x%400 ==0) || (x%4 == 0) && (x%100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }
}
