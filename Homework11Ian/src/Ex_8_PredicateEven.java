/**
 * 8. Use the built-in Predicate<Integer> functional interface to check if a number is even.
 */


import java.util.function.Predicate;

public class Ex_8_PredicateEven {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(100));
        System.out.println(isEven.test(15));

    }
}
