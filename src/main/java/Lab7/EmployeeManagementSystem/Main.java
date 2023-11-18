package Lab7.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Tom Delonge", 2000));
        employees.add(new Employee(2, "Mark Hoppus", 1800));
        employees.add(new Employee(3, "Travis Barker", 2200));

        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem(employees);

        employeeManagementSystem.displayEmployeeDetails(employees);

        System.out.println(employeeManagementSystem.filterEmployeesBySalary(employees, 2000));

        System.out.println(employeeManagementSystem.calculateTotalSalary(employees));
    }
}
