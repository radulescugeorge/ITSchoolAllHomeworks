/**
 * 2. Create a Book class with:
 * <p>
 * - String isbn
 * - String title
 * - String author
 * - double price
 * <p>
 * - Override equals and hashCode so books are distinct based on isbn.
 * - Create a list of books with duplicate ISBNs and varying prices.
 * <p>
 * - Use streams to:
 * -- Remove duplicates based on the ISBN.
 * -- Find the book with the highest price.
 * -- Group books by author and count how many books each author has.
 */



import java.util.*;
import java.util.stream.Collectors;

public class Ex_Book {
    public static void main(String[] args) {
        List<Book> myBooks = List.of(
                new Book("978973", "Jurnal", "Cartarescu", 45),
                new Book("978975", "Enigma", "Cartarescu", 32.5),
                new Book("978977", "Padurea", "Rebreanu", 28),
                new Book("978973", "Maitreyi", "Rebreanu", 39.90),
                new Book("973978", "Ciresarii", "Chirita", 55.75)
        );


        System.out.println(" --- Initial list --- ");
        System.out.println(myBooks);

        List<Book> distinctISBN = myBooks.stream()
                .distinct()
                .toList();

        System.out.println(" --- No duplicate ISBN list --- ");
        System.out.println(distinctISBN);

        System.out.println(" --- Greatest price book --- ");
        System.out.println(myBooks.stream().max(Comparator.comparing(Book::getPrice)));

        System.out.println(" --- Group By Author ");
        Map<String, Long> sumByAuthor = myBooks.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        System.out.println(sumByAuthor);

    }

}

class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return isbn.equals(b.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return " ISBN: " + isbn +
                " Title: " + title +
                " Author: " + author +
                " Price: " + price;
    }
}

