import java.util.function.Predicate;

/**
 *3. Use a lambda with Predicate<Integer> to check if a number is greater than 10.
 */

public class Ex_3_Predicate {
    public static void main(String[] args) {

        int x = 100;

        Predicate<Integer> greaterTen = number -> number > 10;

        System.out.println(greaterTen.test(x));
        System.out.println(greaterTen.test(5));


    }
}
