import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 16. Create a class Book with title and author fields. Given a list of books,
 * find all books written by a specific author.
 */


public class Ex_16_FindBookByAuthor {
    public static void main(String[] args){
        List<Book> myBookList = List.of(
                new Book("Programare Java", "Andrei"),
                new Book("Programare C", "Andrei"),
                new Book("Programare Python", "George"),
                new Book("Programare Android", "Johnny")
        );

        List<Book> sortedBook = myBookList.stream()
                .filter(book -> book.getBookAuthor().equals("Andrei"))
                .toList();

        for(Book b : sortedBook){
            System.out.println("Title: " + b.getBookName() + " Author: " + b.getBookAuthor() );
        }

    }
}

class Book{
    private String bookName;
    private String bookAuthor;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public Book(String bookName, String bookAuthor){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;


    }
}
