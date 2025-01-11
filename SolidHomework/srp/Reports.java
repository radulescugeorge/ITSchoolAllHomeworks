package srp;


public class Reports {
    public void generateEmployeeReport(Employee e, Salary s) {
        System.out.println("Employee Report:");
        System.out.println("Name: " + e.getName());
        System.out.println("Hours Worked: " + e.getHoursWorked());
        System.out.println("Hourly Rate: $" + e.getHourlyRate());
        System.out.println("Salary: $" + s.calculateSalary(e));
    }
}
