//1. Create a List<Integer> and populate it with random integers. Sort the list in ascending and descending order.

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Random randomNumber = new Random();

        // create list and put some random numbers in it
        //I've replaced myList.size() with 15 to limit the list size at 15
        for (int i = 0; i < 15; i++) {
            myList.add(i, randomNumber.nextInt(100));
        }

        // print the initial list
        for (Integer i : myList) {
            System.out.print(i + " ");
        }
        // sort ascending using Collections.sort();
        Collections.sort(myList);

        //print sorted list
        System.out.println(" ");
        System.out.println("Ascending sorted list: ");

        for (Integer i : myList) {
            System.out.print(i + " ");
        }

        // sort descending using reverseOrder() and print
        myList.sort(Collections.reverseOrder());

        System.out.println(" ");
        System.out.println("Descending sorted list: ");

        for (Integer i : myList) {
            System.out.print(i + " ");
        }
    }
}
