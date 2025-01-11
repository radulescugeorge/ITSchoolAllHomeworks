import java.util.Scanner;
import java.util.function.Function;

/**
 * 6. Use a lambda expression with Function<String, Integer> to find the length of a string.
 */


public class Ex_6_LambdaLength {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter string : ");
        String myString = userInput.nextLine();

        Function<String, Integer> getStringLength = str -> str.length();

        Integer stringLength = getStringLength.apply(myString);

        System.out.println("Legth of string is : " + stringLength + "characters long.");



    }
}
