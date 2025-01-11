package library2;

//import java.util.Random;

public abstract class Member {

//    Random randomNumber = new Random();

    private final String name;
    private final String university;
    private final String  memberID;

    protected Member(String name, String university, String memberID) {
        this.name = name;
        this.university = university;
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getMemberID() {
        return memberID;
    }

    public abstract void printMemberDetails();

}
