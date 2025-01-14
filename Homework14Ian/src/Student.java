/**
 * 1. Create a Student class with the following attributes:
 * <p>
 * - int id
 * - String name
 * - double grade
 * <p>
 * - Implement Comparable<Student> to sort students by grade.
 * - Override equals and hashCode to ensure two students are distinct if their id is different.
 * - Create a List<Student> with at least 10 students (some with the same grade or name).
 * <p>
 * – Use a stream to:
 * -- Filter students with a grade higher than a given threshold.
 * -- Sort the students by grade using the natural order (Comparable).
 * -- Collect the sorted students into a new list.
 */



import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public static void main(String[] args) {

        List<Studenti> myStudents = List.of(
                new Studenti(101, "Stefan", 9.5),
                new Studenti(110, "Tanase", 9.75),
                new Studenti(102, "Andrei", 5.5),
                new Studenti(109, "Cristian", 6.35),
                new Studenti(103, "Sabin", 8.55),
                new Studenti(108, "Amalia", 10.0),
                new Studenti(104, "Ionut", 7.25),
                new Studenti(107, "Mircea", 4.60),
                new Studenti(105, "Mihai", 8.00),
                new Studenti(106, "Ion", 7.00)
        );

        System.out.println(" --- Intial list --- ");
        System.out.println(myStudents);

        List<Studenti> aboveEight = myStudents.stream()
                .filter(g -> g.getGrade() >= 8)
                .toList();

        System.out.println(" --- Above 8 list --- ");
        System.out.println(aboveEight);

        List<Studenti> sortedStudenti = myStudents.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(" --- Sorted list --- ");
        System.out.println(sortedStudenti);

    }

}

class Studenti implements Comparable<Studenti> {
    private final int id;
    private final String name;
    private final double grade;

    public Studenti(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return " Student id: " + id + " name: " + name + " has grade " + grade + " ";
    }

    @Override
    public int compareTo(Studenti s) {
        return Double.compare(this.grade, s.grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studenti s = (Studenti) o;
        return id == s.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

}
