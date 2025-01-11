import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Write a program to calculate the number of days, months, and years between
 * two dates entered by the user.
 */

public class BetweenDates {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first date (dd/MM/yyyy)");
        String firstDate = userInput.nextLine();
        System.out.println("Enter the second date (dd/MM/yyyy");
        String secondDate = userInput.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(firstDate, formatter);
        LocalDate d2 = LocalDate.parse(secondDate, formatter);

        Period period = Period.between(d1, d2);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Difference between the dates : ");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

    }

}
