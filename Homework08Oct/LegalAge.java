import java.util.Scanner;

public class LegalAge {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter Age: ");
        try{
            int varsta = inpt.nextInt();
            boolean isLegalAge = varsta >18 ? true:false;
            System.out.println("Is Legal Age ? " + isLegalAge);
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Erorr :" + e);
        }
    }
}
