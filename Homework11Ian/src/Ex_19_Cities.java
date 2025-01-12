import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Create a list of cities and sort them alphabetically in reverse order using streams.
 */

public class Ex_19_Cities {
    public static void main(String[] args) {
        List<String> myCities = List.of("Bucuresti","Arad", "Cluj", "Timisoara", "Iasi", "Constanta", "Zimnicea", "Brasov", "Sibiu" );

        System.out.println(" --- Initial List --- ");
        System.out.println(myCities);

        List<String> sortedCities = myCities.stream()
                .sorted()
                .toList();
        System.out.println(" --- Alphabetically sorted list --- ");
        System.out.println(sortedCities);

        List<String> reverseSortedCities = myCities.stream()
                .sorted(Comparator.comparing(Objects::toString).reversed())
                .toList();
        System.out.println(" --- Reversed sorted list --- ");
        System.out.println(reverseSortedCities);

    }

}
