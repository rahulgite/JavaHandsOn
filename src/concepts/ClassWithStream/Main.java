package concepts.ClassWithStream;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 35, 50000, "IT"),
                new Employee("Jane Doe", 32, 55000, "HR"),
                new Employee("Jim Smith", 40, 60000, "IT"),
                new Employee("Sarah Johnson", 28, 45000, "Marketing"),
                new Employee("Mike Brown", 38, 56000, "IT")
        );

        // Group employees by department name
        Map<String, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employees grouped by department:");
        groupedByDepartment.forEach((department, emps) -> {
            System.out.println(department + ": " + emps.stream().map(Employee::getName).collect(Collectors.toList()));
        });

        // Calculate average salary of employees with age greater than 30
        double avgSalary = employees.stream()
                .filter(e -> e.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage salary of employees with age > 30: " + avgSalary);

        // 3. Employee with highest salary
        Employee highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println("Employee with highest salary: " + highestPaidEmployee.getName());
    }
}

