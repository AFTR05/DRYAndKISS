package co.edu.cue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    private final List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateSumOfSalaries() {
        return employees.stream()
                .mapToDouble(Employee::calculateMonthlySalary)
                .sum();
    }

    public String calculateEmployeesSalary(){
        return employees.stream()
                .map(employee -> employee.getName() + " - " + employee.calculateMonthlySalary())
                .collect(Collectors.joining("\n"));
    }

    public void getAllEmployeeInfo() {
        employees.stream()
                .map(Employee::displayEmployeeInfo)
                .forEach(System.out::println);
    }
}
