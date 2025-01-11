import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a;
        int b;
        int c;
        try {
            System.out.print("Introduceti latura A: ");
            a = inpt.nextInt();
            System.out.print("Introduceti latura B: ");
            b = inpt.nextInt();
            System.out.print("Introduceti latura C: ");
            c = inpt.nextInt();
            if (a + b > c || a + c > b || b + c > a) {
                System.out.println("Triunghi valid");
                if (a == b && b == c) {
                    System.out.println("Triunghiul este echilateral.");
                } else {
                    if (a == b || a == c || b == c) {
                        System.out.println("Triunghiul este isoscel");
                    } else {
                        System.out.println("Triunghiul este scalen");
                    }
                }
            } else {
                System.out.println("Triunghi invalid");
            }
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Erorr :" + e);
        }
    }
}
