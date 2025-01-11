/**
 * Create an enum Day with values for the days of the week
 * and a method to determine if a day is a weekday or weekend.
 */

public class DayTest {

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;


        public boolean isWeekDay(){
            return this != SATURDAY && this != SUNDAY;
        }

    }






}
