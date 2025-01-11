// 10. Create a Set<String> to store student names.
// Add several names, some of them duplicates, and verify that the set only keeps unique names.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex10 {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<>();
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("ID: " + i + " Enter student name: ");
            studentNames.add(userInput.nextLine());
        }

        System.out.println(studentNames);
    }
}
