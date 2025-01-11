import java.util.List;

/**
 * 14. Create a list of strings, filter out strings containing the letter "a",
 * and collect the remaining strings into a new list.
 */

public class Ex_14_StringList {
    public static void main(String[] args) {

        List<String> myList = List.of("Ana", "Barbu", "Costel", "Eugen");

        List<String> myWithoutAList = myList.stream()
                .filter(s -> !s.contains("a"))
                .toList();

        myWithoutAList.forEach(System.out::println);

    }
}
