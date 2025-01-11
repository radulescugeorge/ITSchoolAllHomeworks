// Create two Set<Integer> objects with some common elements.
// Write methods to find the union, intersection, and difference of these sets.

import java.util.HashSet;
import java.util.Set;

public class Ex13 {
    public static void main(String[] args) {

        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(15);
        firstSet.add(25);
        firstSet.add(31);
        firstSet.add(41);
        System.out.println("First set:  " + firstSet);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(5);
        secondSet.add(10);
        secondSet.add(15);
        secondSet.add(20);
        secondSet.add(25);
        System.out.println("Second set: " + secondSet);


        System.out.println("=== Union = Intersection = Difference ===");

        //union - using addAll
        Set<Integer> unionSet = new HashSet<>(firstSet);
        unionSet.addAll(secondSet);
        System.out.println("Union set: " + unionSet);

        //intersection using retainAll
        Set<Integer> intersectionSet = new HashSet<>(firstSet);
        intersectionSet.retainAll(secondSet);
        System.out.println("Intersection set: " + intersectionSet);

        //difference using removeAll
        Set<Integer> differenceSet = new HashSet<>(firstSet);
        differenceSet.removeAll(secondSet);
        System.out.println("Difference set: " + differenceSet);
    }
}
