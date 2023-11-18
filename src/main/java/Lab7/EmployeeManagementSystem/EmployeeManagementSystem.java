package Lab7.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem(List<Employee> employees){
        this.employees = employees;
    }

    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minimum){
        List<Employee> newList = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.salary() >= minimum){
                newList.add(employee);
            }
        }
        return newList;
    }

    public double calculateTotalSalary(List<Employee> employees){
        double sum = 0;
        for(Employee employee: employees){
            sum += employee.salary();
        }
        return sum;
    }

    public void displayEmployeeDetails(List<Employee> employees){
        for(Employee employee : employees){
            System.out.println("Name: " + employee.name() + "; ID: " + employee.id() + "; Salary: " + employee.salary());
        }
    }
}
