import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Develop a program to calculate a person’s exact age in years, months, and days using their birthdate.
 */

public class Birthday {
    public static void main(String[] args){

    String birthday = "21/04/1980";
    timePassed(birthday);


}

public static void timePassed(String string) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate d1 = LocalDate.parse(string, formatter);
    Period period = Period.between(d1, LocalDate.from(now));

    int years = period.getYears();
    int months = period.getMonths();
    int days = period.getDays();

    System.out.println("Time Passed since birthday : ");
    System.out.println("Years: " + years + " Months: " + months + " Days: " + days);

}

}
