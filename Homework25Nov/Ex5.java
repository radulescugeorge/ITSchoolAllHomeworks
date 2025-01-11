//5. Populate a List<Integer>, then convert each integer to its string representation
// and store it in a new List<String>.

import java.util.*;

public class Ex5 {
    public static void main(String[] args) {

        //create lists

        List<Integer> myIntList = new LinkedList<>();
        List<String> myStringList = new LinkedList<>();
        Random randomNumber = new Random();


        //populate integer list with random numbers
        for (int i = 0; i < 15; i++) {
            myIntList.add(i, randomNumber.nextInt(100));
        }

        //populate string list with string values from integer list
        for (int i = 0; i < myIntList.size(); i++) {
            myStringList.add(i, String.valueOf(myIntList.get(i)));
        }


        //print the string list
        System.out.println("String list:  ");
        for (String s : myStringList) {
            System.out.print(s + " ");
        }

        System.out.println("Last element : " + myStringList.getLast() + " and first:  " + myStringList.getFirst());
    }
}
