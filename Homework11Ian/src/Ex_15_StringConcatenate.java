import java.util.List;

/**
 * 15. Concatenate all strings in a list into a single string, separated by commas.
 */

public class Ex_15_StringConcatenate {
    public static void main(String[] args) {
        String string1 = "Ana";
        String string2 = "are";
        String string3 = "mere";

        List<String> myList = List.of(string1,string2,string3);

        //using string builder
        StringBuilder sb = new StringBuilder();
        sb.append(myList);

        System.out.println(sb);

        // using string Joiner
        String joinedString = String.join(", ",myList);
        System.out.println(joinedString);


    }
}
