import java.util.Scanner;

//6. Use a while loop and print the first "n" integers.
// Tema George Radulescu 12 oct

public class nWhileLoop {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int n;
        int i=1;
        try {
            System.out.print("Enter n: ");
            n = userinput.nextInt();
            if (n<1){
                System.out.println("Cannot show nothing. Please enter a number greater than 0.");
            } else {
                while(i<=n){
                    System.out.println(i);
                    i++;
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter an integer.");
            System.out.println("Error: " + e);
        }
    }
}
