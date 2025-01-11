package library2;

public class Main {
    public static void main(String[] args) {
        Member firstStudent = new Student("John Doe","Univ. Ovidius", "1234", "Stiinte Economice");

        Member secondStudent = new Student("Jane Doe", "Univ. Politehnica", "4567", "Automatica");

        Member firstTeacher = new Teacher("Popescu Ion","Ovidius","9998","Mate");

        Member secondTeacher = new Teacher("Popeasca Ioana","UBB","8887","Contabilitate");

        Book firstBook = new Book("Java","Brian S.","1995");

        Book secondBook = new Book("Cplusplus", "Tom H.","1979");

        firstBook.loanBook(firstStudent.getName(), firstBook.getTitle());
        firstBook.returnBook(firstStudent.getName(), firstBook.getTitle());

        firstBook.loanBook(firstTeacher.getName(), firstBook.getTitle());
        firstBook.returnBook(firstTeacher.getName(), firstBook.getTitle());

        firstBook.loanBook(secondStudent.getName(), firstBook.getTitle());
        firstBook.returnBook(secondStudent.getName(), firstBook.getTitle());

        secondBook.loanBook(secondTeacher.getName(), secondBook.getTitle());
        secondBook.returnBook(secondTeacher.getName(), secondBook.getTitle());

        secondBook.loanBook(firstTeacher.getName(), secondBook.getTitle());
        secondBook.returnBook(firstTeacher.getName(), secondBook.getTitle());

        firstBook.printBookDetails();
        firstBook.printBookMovements();

        secondBook.printBookDetails();
        secondBook.printBookMovements();







    }
}
