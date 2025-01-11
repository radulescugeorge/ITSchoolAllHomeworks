import java.util.Scanner;

//11. Create a program that takes a list of 5 names from the user and stores them in a String array.
// Use a for loop to display each name in reverse order.
// Tema George Radulescu 12 oct

public class NameStringArray {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        String[] names = new String[5];

        System.out.print("Enter first name: ");
        names[0] = userinput.next();
        System.out.print("Enter second name: ");
        names[1] = userinput.next();
        System.out.print("Enter third name: ");
        names[2] = userinput.next();
        System.out.print("Enter fourth name: ");
        names[3] = userinput.next();
        System.out.print("Enter fifth name: ");
        names[4] = userinput.next();

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
