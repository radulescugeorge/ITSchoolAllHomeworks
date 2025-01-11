import java.util.List;
import java.util.stream.Stream;

/**
 * 12. Create a list of unique integers (remove duplicates) from an existing list using distinct().
 */

public class Ex_12_StreamDistinct {
    public static void main(String[] args) {

        List<Integer> myList = List.of(5,5,7,2,7,25,35,25,75);

        List<Integer> myDistinct = myList.stream()
                .distinct()
                .toList();

        myDistinct.forEach(System.out::println);

    }
}
