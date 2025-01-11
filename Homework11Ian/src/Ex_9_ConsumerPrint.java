import java.util.List;
import java.util.function.Consumer;

/**
 * 9. Use the built-in Consumer<String> functional interface to print strings prefixed with "Hello, ".
 */


public class Ex_9_ConsumerPrint {
    public static void main(String[] args) {
        List<String> myList = List.of("Hello, world!", "Hello, All!", "Good to see you !", "Have a nice day!");

        myList.forEach(System.out::println);
        System.out.println("----- And filtered : -------------------");

        Consumer<String> printHelloFirst = s -> {
            if (s.startsWith("Hello,")){
                System.out.println(s);
            }
        };

        myList.forEach(printHelloFirst);

    }
}
