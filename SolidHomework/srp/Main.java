package srp;

/**
 * Refactor the Employee class to adhere to SRP.
 * Split responsibilities into separate classes.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Employee george = new Employee("George",40,10);
        Salary georgeSalary = new Salary();
        Reports georgeReport = new Reports();
        georgeReport.generateEmployeeReport(george, georgeSalary);
    }
}