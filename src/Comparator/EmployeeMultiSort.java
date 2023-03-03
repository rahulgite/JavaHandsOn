package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeMulti {
    private String name;
    private int experience;
    private String location;
    private double salary;

    public EmployeeMulti(String name, int experience, String location, double salary) {
        this.name = name;
        this.experience = experience;
        this.location = location;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<EmployeeMulti> employees = new ArrayList<>();
        employees.add(new EmployeeMulti("John", 2, "New York", 5000));
        employees.add(new EmployeeMulti("Jane", 2, "London", 6000));
        employees.add(new EmployeeMulti("Bob", 3, "Paris", 4000));

        // Sort employees by experience, then location, then salary using a comparator
        Collections.sort(employees, new Comparator<EmployeeMulti>() {
            @Override
            public int compare(EmployeeMulti e2, EmployeeMulti e1) {
                if (e1.getExperience() != e2.getExperience()) {
                    return Integer.compare(e2.getExperience(), e1.getExperience());
                } else if (!e1.getLocation().equals(e2.getLocation())) {
                    return e1.getLocation().compareTo(e2.getLocation());
                } else {
                    return Double.compare(e1.getSalary(), e2.getSalary());
                }
            }
        });

        // Print sorted employees
        for (EmployeeMulti employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getExperience() + ", " + employee.getLocation() + ", " + employee.getSalary());
        }
    }
}
