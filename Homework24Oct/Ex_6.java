import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number to be written: ");
        int number = userInput.nextInt();
        int reverse = 0;

        while (number != 0){
            int rest = number%10;
            reverse = reverse*10+rest;
            number = number/10;
        }
        System.out.println(reverse);

//        String number = userInput.nextLine();
//        char[] numberChars = number.toCharArray();
//
//        for (int i = numberChars.length; i > 0; i--) {
//            System.out.print(i);
//        }
    }
}
