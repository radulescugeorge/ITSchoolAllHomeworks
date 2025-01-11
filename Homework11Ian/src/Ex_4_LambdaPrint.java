import java.util.List;
import java.util.function.Consumer;

/**
 * 4. Print all elements of a list using Consumer<String> and a lambda expression.
 */

public class Ex_4_LambdaPrint {
    public static void main(String[] args) {

        List<String> myStrings = List.of("Keyboard", "Monitor", "Pen", "Computer");

        Consumer<String> printString = s -> System.out.print(s + ", ");

        myStrings.forEach(printString);
    }
}
