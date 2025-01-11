//8. Create a TreeSet<Integer> and add random integers.
// Verify that the integers are stored in ascending order.


import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Set<Integer> myTreeSet = new TreeSet<>();
        Random randomNumber = new Random();

        for (int i = 0; i < 15; i++) {
            myTreeSet.add(randomNumber.nextInt(100));
        }

        System.out.println(myTreeSet);
    }
}
