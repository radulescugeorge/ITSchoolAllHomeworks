public class Student implements Comparable<Student> {
    private String name;
    private String year;
    private int grade;

    public Student(String name, String year, int grade) {
        this.name = name;
        this.year = year;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showStudentDetails() {
        System.out.println("Name: " + this.getName() + ", year: " + this.getYear() + ", grade: " + this.getGrade());
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.grade);
    }
}
