import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ZiuaSaptamanii {
    public static void main(String[] args) {

        String dateString = "2024-12-08"; // Example date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateString, formatter);

        java.time.DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Day of the week for " + dateString + " is: " + dayOfWeek);

    }

}
