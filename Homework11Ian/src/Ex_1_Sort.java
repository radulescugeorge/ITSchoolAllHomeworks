import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1. Sort a list of integers in ascending order using an anonymous class for the comparator.
 */

public class Ex_1_Sort {
    public static void main(String[] args){
        // List<Integer> myList = List.of(10,5,7,25,15,13);
        // if I declare like this, it will throw an exception - immutable

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(5);
        myList.add(7);
        myList.add(25);
        myList.add(15);
        myList.add(13);

        // sorted with streams.

        List<Integer> sortedList = myList.stream()
                .sorted()
                .toList();

        System.out.println(sortedList);

        //sorted with collections compare
        Collections.sort(myList, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });

        System.out.println(myList);

    }

}
