package library2;

public class Teacher extends Member {
    private final String department;

    public Teacher(String name, String university, String memberID, String department) {
        super(name, university, memberID);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void printMemberDetails() {
        System.out.println("--------------------");
        System.out.println("Print teacher " + this.getMemberID() + " details: ");
        System.out.println("Name: " + this.getName());
        System.out.println("University: "+this.getUniversity());
        System.out.println("Department: "+ this.getDepartment());
    }
}
