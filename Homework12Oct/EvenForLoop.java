import java.util.Scanner;

//9. Write a program that takes an integer n and uses a FOR loop to print the first n even numbers.
// Tema George Radulescu 12 oct
public class EvenForLoop {
    public static void main(String[] args) {
        int var1=1;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter how many even numbers : ");

        try{
            var1 = userinput.nextInt();
            if (var1 < 1){
                System.out.println("Enter numbers grater than 1 to show at least on even number.");
            } else {
                for (int i = 1; i < var1 + 1; i++) {
                    System.out.println(i + ". Even number is: " + i * 2);
                }
            }
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Error: " + e);
        }
    }
}
