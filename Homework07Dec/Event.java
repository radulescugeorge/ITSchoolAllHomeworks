import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Create a class Event with a field eventTime (using LocalDateTime).
 * Add a method to calculate how much time remains until the event.
 */

public class Event {
    public static void main(String[] args) {

        String dateString = "21/04/2045";
        untilTheEvent(dateString);


    }

    public static void untilTheEvent(String string) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(string, formatter);
        Period period = Period.between(LocalDate.from(now), d1);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Remaining time until the event : ");
        System.out.println("Years: " + years + " Months: " + months + " Days: " + days);

    }
}