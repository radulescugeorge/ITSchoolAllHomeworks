 import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner inpt3 = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        try{
            int grade = inpt3.nextInt();
            if (grade > 0 && grade <= 10){
                boolean isPassed = grade >= 5 ? true:false;
                System.out.println("Student Passed ? " + isPassed);
            } else {
                System.out.println("Grades must be between 1 and 10.");
            }
        } catch (Exception e) {
            System.out.println("Enter only integers, please !");
            System.out.println("Erorr :" + e);
        }
    }
}