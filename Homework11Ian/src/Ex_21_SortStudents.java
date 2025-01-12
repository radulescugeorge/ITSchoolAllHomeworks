import java.util.Comparator;
import java.util.List;

/**
 * 21. Create a class Student with fields name and grade.
 * <p>
 * Given a list of students, sort them by their grades in ascending order using sorted().
 * Collect the sorted list of students.
 */
public class Ex_21_SortStudents {
    public static void main(String[] args) {
        List<Student> myStudents = List.of(
                new Student("Ana", 10),
                new Student("Bianca", 9),
                new Student("Cristina",5),
                new Student("Daniela",7),
                new Student("Eugenia", 6)
        );

        System.out.println("  --- Initial List --- ");
        System.out.println(myStudents);

        List<Student> sortedByGrade = myStudents.stream()
                .sorted(Comparator.comparingInt(Student::getGrade))
                .toList();

        System.out.println("  --- Sorted List --- ");
        System.out.println(sortedByGrade);
    }

}

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student name: " + name + " has grade : " + grade;
    }

}
