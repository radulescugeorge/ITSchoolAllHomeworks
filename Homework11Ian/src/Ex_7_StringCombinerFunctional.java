/**
 * 7. Define a functional interface StringCombiner with a method String combine(String s1, String s2)
 * and use a lambda to concatenate two strings with a space in between.
 */

public class Ex_7_StringCombinerFunctional {
    public static void main(String[] args) {
        String firstString = "First string";
        String secondString = "Second string";

        StringCombiner concatenateNewString  = (a,b) -> (a + " " + b);
        String thirdString = concatenateNewString.stringCombine(firstString, secondString);
        System.out.println(thirdString);

    }

    @FunctionalInterface
    interface StringCombiner {
        String stringCombine(String s1, String S2);
    }
}
