// Using the Student class, add students to a TreeSet<Student> based on their grade.
// Display the students in ascending order of grades.

import java.util.*;

public class Ex11 {
    public static void main(String[] args) {
        // set new TreeSet
        Set<Student> myStudentList = new TreeSet<>();

        //add items into TreeSet
        myStudentList.add(new Student("Iliescu","First Year", 6));
        myStudentList.add(new Student("Constantinescu","First Year", 7));
        myStudentList.add(new Student("Basescu","First Year", 9));
        myStudentList.add(new Student("Iohanis","First Year", 5));
        myStudentList.add(new Student("Ceausescu","First Year", 4));

        //Print the TreeSet. It's printing in ascending order of grades !?
        for (Student student : myStudentList) {
            student.showStudentDetails();
        }


    }
}
