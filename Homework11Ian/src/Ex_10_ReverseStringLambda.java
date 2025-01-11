/**
 * Define a functional interface Transformer<T> with a method T transform(T input)
 * and use a lambda to reverse a string.
 */

public class Ex_10_ReverseStringLambda {
    public static void main(String[] args) {

        String myString = "George";

        Transformer<String> rev = s -> {
          StringBuilder reversed = new StringBuilder(s);
            return String.valueOf(reversed.reverse());
        };

        String newString = rev.transform(myString);
        System.out.println(newString);

    }

    @FunctionalInterface
    interface Transformer<T>{
        T transform(T t);
    }
}
