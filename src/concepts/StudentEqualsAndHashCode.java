package concepts;

import java.util.Objects;

public class StudentEqualsAndHashCode {
    private String name;
    private int age;
    private String rollNumber;

    // constructor, getters, and setters ...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        StudentEqualsAndHashCode student = (StudentEqualsAndHashCode) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rollNumber);
    }
}
