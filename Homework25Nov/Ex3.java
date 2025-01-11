//3. Create a List<Double> with positive and negative numbers.
// Write a method to remove all negative numbers from the list.

import java.util.LinkedList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        // create list and add some items in it
        List<Double> doubleList = new LinkedList<>();

        doubleList.add(0, -20d);
        doubleList.add(1, 22d);
        doubleList.add(2, -21d);
        doubleList.add(3, 30d);
        doubleList.add(4, 4.5d);
        doubleList.add(5, -227.5d);
        doubleList.add(6, 15d);
        doubleList.add(7, 1d);
        doubleList.add(8, -3d);
        doubleList.add(9, 45.5d);

        // print the list

        for (Double v : doubleList) {
            System.out.print(v + " ");
        }

        // remove all negative numbers

        for (int i = 0; i < doubleList.size(); i++) {
            if (doubleList.get(i) < 0) {
                doubleList.remove(i);
            }
        }

        // print the remaining list

        System.out.println(" ");
        System.out.println(" -------------------- ");

        for (Double v : doubleList) {
            System.out.print(v + " ");
        }
    }
}
