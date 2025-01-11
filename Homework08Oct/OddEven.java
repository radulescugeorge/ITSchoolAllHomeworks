import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner inpt2 = new Scanner(System.in);
        System.out.print("Enter Number: ");
        try{
            int nr1 = inpt2.nextInt();
            boolean isEven = nr1%2 == 0 ? true:false;
            System.out.println("Is Even ? " + isEven);
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Erorr :" + e);
        }
    }

}
