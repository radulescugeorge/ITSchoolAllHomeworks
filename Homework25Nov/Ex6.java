// 6. Create a List<Character> with random alphabet characters.
// Sort the list ignoring case and display it.

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {

        // create list with 25 element using random numbers between 65->90 and 97->122 , i.e. ascii codes for letters
        List<Character> myCharList = new LinkedList<>();
        Random randomAscii = new Random();
        int r;

        for (int i = 0; i < 25; i++) {
            r = 1 + randomAscii.nextInt(65, 122);
            // if random number is between 90 and 97 (no letters here) increase it up to exit this interval;
            if (r > 90 && r < 97) {
                r += (97 - 90);
            }
            myCharList.add(i, (char) r);
        }

        //print the initial list
        for (Character c : myCharList) {
            System.out.print(c + " ");
        }

        //sort the list
        myCharList.sort(Comparator.comparing(Character::toLowerCase));

        System.out.println(" ");
        System.out.println("Sorted list: " + myCharList); // print without for cycle :)
    }
}
