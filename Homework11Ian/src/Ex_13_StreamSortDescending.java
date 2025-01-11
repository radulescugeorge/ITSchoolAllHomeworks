import java.util.Collections;
import java.util.List;

/**
 * 13. Sort a list of integers in descending order using sorted().
 */


public class Ex_13_StreamSortDescending {
    public static void main(String[] args) {
        List<Integer> myList = List.of(455,45,72,2,7,25,35,25,75);

        List<Integer> mySortedList = myList.stream()
                .sorted(Collections.reverseOrder())
                .toList();

        mySortedList.forEach(System.out::println);
    }
}
