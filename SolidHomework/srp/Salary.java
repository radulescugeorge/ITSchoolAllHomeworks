package srp;

public class Salary {
    public double calculateSalary(Employee e){
        return e.getHourlyRate()*e.getHoursWorked();
    }
}
