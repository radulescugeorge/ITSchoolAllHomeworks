import java.util.*;

public class Ex4 {
    public static void main(String[] args) {

        List<String> myBookList = new LinkedList<>();   // create list
        Scanner userInput = new Scanner(System.in);     // call scanner for user input


        // ask the user to put some values in the list
        for (int i = 0; i < 6; i++) {
            System.out.print("Index " + i + " book title: ");
            myBookList.addFirst(userInput.nextLine());
        }

        //print the list
        System.out.println(" --------------------- ");
        for (String s : myBookList) {
            System.out.print(s + " ");
        }

        // search for a specific element in the list
        System.out.println(" ");
        System.out.print("Enter title to search: ");
        String searchTitle = userInput.nextLine();

        if(myBookList.contains(searchTitle)){
            System.out.println("Title found");
        } else {
            System.out.println("Title not found");
        }

        //remove a specific element in the list
        System.out.println(" ");
        System.out.print("Enter title to remove: ");
        String removeTitle = userInput.nextLine();

        if(myBookList.contains(removeTitle)){
            myBookList.remove(removeTitle);
            System.out.println("Title removed");
        } else {
            System.out.println("Title not found. Nothing to remove.");
        }

        //print what's left in the list

        System.out.println(" ");
        System.out.println(" --------------------- ");
        for (String s : myBookList) {
            System.out.print(s + " ");
        }
    }
}
