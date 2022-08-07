package concepts;

import java.util.Objects;

public class EqualsAndHashcodeContract {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("RG");
        Employee e2=new Employee();
        e2.setId(1);
        e2.setName("RG");

        System.out.println(e1.hashCode() +" "+e2.hashCode());
        System.out.println("Shallow Comparison: "+ (e1==e2));
        System.out.println("Deep Comparison: "+ (e1.equals(e2)));
    }
}

class Employee{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getId(), employee.getId()) && Objects.equals(getName(), employee.getName());
    }

    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = 31 * result + name.hashCode();
        }
        if (id != null) {
            result = 31 * result + id.hashCode();
        }
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    String name;
}