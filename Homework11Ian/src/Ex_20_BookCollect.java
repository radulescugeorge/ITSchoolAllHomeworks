import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a class Book with fields title and author.
 * <p>
 * Given a list of books, filter out duplicates by the title using distinct().
 * Collect the distinct books into a new list.
 */

public class Ex_20_BookCollect {
    public static void main(String[] args) {
        List<Carte> cartileMele = List.of(
                new Carte("Iarna", "George"),
                new Carte("Iarna", "Cosbuc"),
                new Carte("Manual utilizare iPhone", "Steve"),
                new Carte("Utilizare Windows 95", "Bill")
        );

        System.out.println(" --- Initial list : --- ");
        System.out.println(cartileMele);

        List<Carte> cartiUnicat = cartileMele.stream()
                .distinct()
                .toList();

        // you need to override hashCode and equals method in Carte class
        // otherwise it will compare full objects by all atributes

        System.out.println(" --- Distinct list : --- ");
        System.out.println(cartiUnicat);

    }

}

class Carte {
    String title;
    String author;

    public Carte(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book title: " + title + " by author : " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return title.equals(carte.title);
    }

    @Override
    public int hashCode(){
        return title.hashCode();
    }

}
