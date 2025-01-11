import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("MMM-yyyy");


        String date1 = now.format(format1);
        String date2 = now.format(format2);
        String time = now.format(format3);
        String date3 = now.format(format4);

        System.out.println("Date (dd-MM-yyyy): " + date1);
        System.out.println("Date (dd/MMM/yyyy): " + date2);
        System.out.println("Time (HH:mm:ss): " + time);
        System.out.println("Date (MMM -yyyy)" + date3);
    }
}
