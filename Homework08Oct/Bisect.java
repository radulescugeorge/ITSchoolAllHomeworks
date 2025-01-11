import java.util.Scanner;

public class Bisect {
    public static void main(String[] args) {
        Scanner inpt3 = new Scanner(System.in);
        System.out.print("Enter Year: ");
        try{
            int year = inpt3.nextInt();
            boolean isBisect = year%4 == 0 ? true:false;
            System.out.println("Anul este bisect ? " + isBisect);
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Erorr :" + e);
        }
    }
}
