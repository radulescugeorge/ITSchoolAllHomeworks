import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 2. Filter a list of strings to only include those starting with "A" using a lambda expression.
 */

public class Ex_2_Filter {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Andrei");
        stringList.add("George");
        stringList.add("Alexandra");
        stringList.add("Constantin");

        List<String> aList = stringList.stream()
                //.filter(s -> s.charAt(0)=='A')
                .filter(s -> s.startsWith("A"))
                .toList();

        System.out.println(aList);



    }
}
