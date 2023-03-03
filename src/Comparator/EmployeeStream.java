package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeStream {
    private String name;
    private int experience;
    private String location;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "EmployeeStream{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeeStream(String name, int experience, String location, int salary) {
        this.name = name;
        this.experience = experience;
        this.location = location;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<EmployeeStream> employees = getEmployeeList(); // this is your list of employees

        Comparator<EmployeeStream> c = Comparator.comparingInt(EmployeeStream::getExperience).reversed()
                .thenComparing(EmployeeStream::getLocation).reversed()
                .thenComparingInt(EmployeeStream::getSalary).reversed();
        employees.stream()
                .peek(e -> {
                    if (e.getLocation().equals("Paris")) e.setSalary(e.getSalary() + 1000);
                })
                .sorted(c)
                .forEach(System.out::println);
    }

    private static List<EmployeeStream> getEmployeeList() {
        List<EmployeeStream> employees = new ArrayList<EmployeeStream>();
        employees.add(new EmployeeStream("John", 2, "New York", 5000));
        employees.add(new EmployeeStream("Jane", 2, "New York", 6000));
        employees.add(new EmployeeStream("Bob", 2, "Paris", 4000));
        employees.add(new EmployeeStream("Bob", 3, "Paris", 4000));
        return employees;

    }
}