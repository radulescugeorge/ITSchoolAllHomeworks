//4. Create a program that takes an integer input (1-7) representing a day of the week and uses a switch
// statement to print the name of the day (e.g., 1 = "Monday", 2 = "Tuesday", etc.).
// Please use Java 14+ Switch statement).
// Tema George Radulescu 12 oct

import java.util.Scanner;

public class WeekDayJava14Switch {
    public static void main(String[] args) {
        Scanner userinpt = new Scanner(System.in);
        System.out.print("Enter day number: ");
        try{
            int userday = userinpt.nextInt();
            if (userday >= 1 && userday<=7){
                switch (userday){
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("saturday");
                    case 7 -> System.out.println("Sunday");
                }
            } else {
                System.out.println("Days numbers must be between 1 and 7.");
            }
        } catch (Exception e) {
            System.out.println("Enter only integers, please");
            System.out.println("Error " + e);
        }
    }
}
