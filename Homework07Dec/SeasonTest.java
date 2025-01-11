/**
 * Create an enum Season with constants SPRING, SUMMER, AUTUMN, and WINTER.
 * Add a field for average temperature and a method to get a description for each season.
 */

public class SeasonTest {

    public enum Season{
        SPRING(10,"Spring"),
        SUMMER(20, "Summer"),
        AUTUMN(10, "Autumn"),
        WINTER(1, "Winter")
        ;

       private final int averageTemperature;
       private final String description;

       Season(int averageTemperature, String description){
           this.averageTemperature = averageTemperature;
           this.description = description;
       }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return description;
        }
    }
}
