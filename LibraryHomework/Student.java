package library2;

public class Student extends Member {
    private final String faculty;

    public Student(String name, String university, String memberID, String faculty) {
        super(name, university, memberID);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public void printMemberDetails() {

        System.out.println("--------------------");
        System.out.println("Print student " + this.getMemberID() + " details: ");
        System.out.println("Name: " + this.getName());
        System.out.println("University: "+this.getUniversity());
        System.out.println("Faculty: "+ this.getFaculty());

    }
}
