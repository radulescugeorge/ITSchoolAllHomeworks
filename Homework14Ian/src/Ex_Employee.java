/**
 * 3. Create an Employee class with:
 * <p>
 * - int id
 * - String name
 * - String department
 * - double salary
 * <p>
 * - Implement Comparable<Employee> to sort by salary in descending order.
 * - Override equals and hashCode to ensure employees are distinct based on id.
 * - Create a list of employees in multiple departments.
 * <p>
 * - Use streams to:
 * -- Calculate the average salary of employees per department.
 * -- Find the top 3 highest-paid employees across all departments.
 * -- Partition employees into two groups: those earning more than a given amount and those earning less.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Ex_Employee {
    public static void main(String[] args) {
        List<Employee> myEmployees = List.of(
                new Employee(4788, "Laurentiu", "Management", 5000),
                new Employee(4877, "Ionut", "Sales", 3499),
                new Employee(4655, "Daniel", "Sales", 3650),
                new Employee(4566, "Anca", "Operations", 4100),
                new Employee(4325, "Cristi", "Warehouse", 2500),
                new Employee(4423, "Cosmin", "Warehouse", 2550)
        );

        System.out.println(" --- Initial List --- ");
        for (Employee myEmployee : myEmployees) {
            System.out.println("ID: " + myEmployee.getId() + " Employee: " + myEmployee.getName() + ", Department: " + myEmployee.getDepartment() + ", Salary: " + myEmployee.getSalary());
        }

        System.out.println(" --- Salary descending List --- ");

        List<Employee> descendingSalary = myEmployees.stream()
                .sorted()
                .toList();
        descendingSalary.forEach(s -> System.out.println(s.getName() + " " + s.getSalary()));


        System.out.println(" --- Average salary by department List --- ");
        Map<String, Double> averageSalaryDept = myEmployees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(e -> e.getSalary())));
        System.out.println(averageSalaryDept);

        System.out.println(" --- Top 3 salaries List --- ");
        List<Employee> topThreeSalaries = myEmployees.stream()
                .sorted()
                .limit(3)
                .toList();
        topThreeSalaries.forEach(s -> System.out.println(s.getName() + " " + s.getSalary()));

        Map<Boolean, List<Employee>> partitionedEmployees = myEmployees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 3500));
        List<Employee> aboveSalaryEmployee = partitionedEmployees.get(true);
        List<Employee> belowSalaryEmployee = partitionedEmployees.get(false);

        System.out.println(" --- Salary below 3500 list --- ");
        belowSalaryEmployee.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

        System.out.println(" --- Salary above 3500 list --- ");
        aboveSalaryEmployee.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

    }
}

class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;
    private final String department;
    private final double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee e) {
        return Double.compare(e.salary, this.salary);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " Name: " + name +
                " Department: " + department +
                " Salary: " + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return id == e.id;
    }
}

