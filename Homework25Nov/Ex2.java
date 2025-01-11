//2. Take a sentence as input, split it into words, and store the words in a List<String>.
// Remove duplicate words and display the list in alphabetical order.

import java.util.*;
import java.lang.String;

public class Ex2 {
    public static void main(String[] args) {

        //get phrase from user
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter phrase: ");
        String myPhrase = userInput.nextLine();

        //Split the string into a List
        List<String> mySplittedString = new ArrayList<>(Arrays.asList(myPhrase.split(" ")));

        //print the List
        for (String s : mySplittedString) {
            System.out.println(s);
        }

        // first sort the list

        Collections.sort(mySplittedString);

        // and then remove duplicates. Basically we compare two nearby elements of the list.
        // If they are equals we remove one

        for (int i = 1; i < mySplittedString.size(); i++) {
            if(mySplittedString.get(i).equals(mySplittedString.get(i-1))){
                mySplittedString.remove(mySplittedString.get(i));
            }
        }

        //and finally we print the remaining list

        System.out.println(" ");
        System.out.println(" --------------- ");

        for (String s : mySplittedString) {
            System.out.println(s);
        }
    }
}
