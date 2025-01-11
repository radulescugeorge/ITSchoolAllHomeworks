//7. Using the Student class, create a list of students with different grades.
// Find and display the top 3 students based on their grades.


import java.util.*;

public class Ex7 {
    public static void main(String[] args) {

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("Alex", "anul I", 10));
        myStudents.add(new Student("Madalina", "anul I", 7));
        myStudents.add(new Student("Bianca", "anul I", 8));
        myStudents.add(new Student("Cosmin", "anul II", 9));
        myStudents.add(new Student("Constantin", "anul II", 8));
        myStudents.add(new Student("Dorel", "anul III", 5));

        for (int i = 0; i < myStudents.size(); i++) {
            myStudents.get(i).showStudentDetails();
        }

        myStudents.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        System.out.println(" ");
        System.out.println(" === Top 3 Students : === ");

        for (int i = 0; i < 3; i++) {
            myStudents.get(i).showStudentDetails();
        }
    }
}



