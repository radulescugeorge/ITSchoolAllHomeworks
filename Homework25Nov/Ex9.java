//9. Create a TreeSet<String> and add various city names.
// Display the cities in alphabetical order. Then try to display them in reverse alphabetical order.

import java.util.*;

public class Ex9 {
    public static void main(String[] args) {

        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("Tokyo");
        mySet.add("Vienna");
        mySet.add("Berlin");
        mySet.add("London");
        mySet.add("Roma");
        mySet.add("New York");

        System.out.println(" ");
        System.out.println(" === Initial TreeSet === ");
        System.out.println(mySet);

        System.out.println(" ");
        System.out.println(" === Reversed TreeSet === ");
        System.out.println(mySet.descendingSet());
    }
}
