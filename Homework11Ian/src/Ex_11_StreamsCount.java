/**
 * 11. Count the number of strings in a list that are longer than 5 characters.
 */
import java.util.List;
import java.util.stream.Stream;

public class Ex_11_StreamsCount {
    public static void main(String[] args) {

        List<String> myList = List.of("Geo", "Alex", "Madalina","Valentin", "Lacramioara");

        Stream<String> myStream = myList.stream()
                .filter(s ->s.length()>5);

        long counter = myStream.count();
        System.out.println(counter);









    }
}
