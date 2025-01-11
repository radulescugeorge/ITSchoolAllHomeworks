//8. Create a program that keeps asking the user for integers until the user enters a negative number.
// Calculate and print the sum of all positive numbers entered.
// Tema George Radulescu 12 oct
import java.util.Scanner;

public class PositiveIntegersSum {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int k=0, sum = 0;

        while (k>=0){
            System.out.print("Enter number: ");
            try{
                k = userinput.nextInt();
                if (k<0){
                    break;
                } else {
                    sum = sum + k;
                }
            } catch (Exception e) {
                System.out.println("Oroare: " + e);
                break;
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
