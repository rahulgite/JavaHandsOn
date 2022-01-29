import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String args[]){
        // Filtering rawList in filteredList having elements greater than 20.
        List<Integer> rawList=Arrays.asList(10,20,30,40,50);
        ArrayList<Integer> filteredList = (ArrayList<Integer>) rawList.stream()
                .filter(z -> z > 20).collect(Collectors.toList());
        System.out.println("Filtered Lists :"+filteredList);

        // Filter Objects in Stream
        // Filtering student Object's having Age greater than 26
        List<Student> studentList= Arrays.asList(
                new Student("XYZ",27),
                new Student("ABC",26));

        ArrayList<Student> filter= (ArrayList<Student>) studentList.stream()
                .filter(a -> a.getAge() > 26).collect(Collectors.toList());
        System.out.println("Students having age greater tha 26 "+filter);

        // Count, Sum, and Average using Stream
        // Count number of elements greater than 20.
        System.out.println("Count :"+ rawList.parallelStream().filter(z->z>20).count());
        // Sum of elements greater than 20.
        System.out.println("Sum:"+ rawList.parallelStream().filter(z->z>20).mapToInt(p->p).sum());
        // Average of elements greater than 20
        System.out.println("Average:"+ rawList.parallelStream().filter(z->z>20).mapToInt(p->p).average());


        // Sorting using Stream
        //Natural Sorting in ascending order
        System.out.println("Natural Sorting :"+ rawList.parallelStream()
                .sorted().collect(Collectors.toList()));
        //Sorting in ascending using comparator
        System.out.println("Comparator Ascending Sorting :"+ rawList.parallelStream()
                .sorted((x,y)-> x.compareTo(y)).collect(Collectors.toList()));
        //Sorting in descending using comparator
        System.out.println("Comparator Descending Sorting :"+ rawList.parallelStream()
                .sorted((x,y)-> y.compareTo(x)).collect(Collectors.toList()));


        // Minimum and Maximum using Stream
        //Minimum using min function
        System.out.println("Minimum :"+ rawList.parallelStream().min((x,y)->x.compareTo(y)).get());
        //Maximum using min function
        System.out.println("Maximum:"+ rawList.parallelStream().min((x,y)->y.compareTo(x)).get());
        //Maximum using max function
        System.out.println("Maximum :"+ rawList.parallelStream().max((x,y)->x.compareTo(y)).get());
        //Minimum using max function
        System.out.println("Minimum:"+ rawList.parallelStream().max((x,y)->y.compareTo(x)).get());

        // ToArray in Stream
        //Converting Stream into Array
        System.out.println("Convert Stream to Array");
        Object[] o = rawList.parallelStream().toArray();
        for(Object c:o) {
            System.out.print(c+" ");
        }

        // of in Stream
        //It converts any group of elements into Stream.
        System.out.println("\n Convert Group to Stream");
        Stream.of(1,2,3,4,66,5).forEach(m->System.out.print(m*m+" "));

        // Sorting Objects using Stream
        //Using Comparator to sort student by name and then age.
        Comparator<Student> sortByNameAndAge = Comparator
                .comparing(Student::getName)
                .thenComparingInt(Student::getAge);
        //Applying sortByNameAndAge Comparator in Stream using sorted function.
        ArrayList<Student> sortStudent=(ArrayList<Student>) studentList.stream()
                .sorted(sortByNameAndAge).collect(Collectors.toList());
        System.out.println("\n Sorted Student Objects"+sortStudent);

        //Filtering Objects within Object
        List<Person> p=Arrays.asList(
                new Person("XYZ", new Address[]{new Address("Pune"), new Address("Delhi")}),
                new Person("ABC", new Address[]{new Address("Bhopal"), new Address("Delhi")}),
                new Person("XYZ", new Address[]{new Address("Srinagar"), new Address("Rajkot")}));

        List<Person> f=p.stream().filter(a->a.name.contains("XYZ") )
                .filter(b->{
                    return Arrays.stream(b.address)
                            .filter(c -> c.city.contains("Delhi")).collect(Collectors.toList()).size()>0;
                } )
                .collect(Collectors.toList());
        System.out.println("\n Filtered objects of object"+f);
    }
}

class Person{
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + Arrays.toString(address) +
                '}';
    }

    public Person(String name, Address[] address) {
        this.name = name;
        this.address = address;
    }

    Address[] address;
}
class Address{
    String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public Address(String city) {
        this.city = city;
    }
}

 class Student {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;


}
