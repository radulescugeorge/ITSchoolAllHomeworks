// Create a Book class with title, author, and year.
// Add several books to a Set<Book>, including some with the same author and title.
// Implement equals and hashCode to ensure each book is unique.

import java.util.*;

public class Ex12 {
    public static void main(String[] args) {

        // create set as HashSet.
        Set<Book> mySetBook = new HashSet<>();

        mySetBook.add(new Book("Cum sa castigi alegerile pe tik-tok","Calin Georgescu", 2025));
        mySetBook.add(new Book("Tehnici de zbor cu jetul privat","Marcel Ciolacu", 2025));
        mySetBook.add(new Book("De la galerie spre Cotroceni", "George Simion", 2021));
        mySetBook.add(new Book("Viata fara regulament", "Nicolae Ciuca", 2023));
        mySetBook.add(new Book("Viata fara regulament", "Nicolae Ciuca", 2023));
        mySetBook.add(new Book("Patriarhat sau Matriarhat", "Elena Lasconi", 2024));

        // print details. Since it's a HashSet - no duplicates. ?
        for (Book book : mySetBook) {
            book.showBookDetails();
        }
    }
}
