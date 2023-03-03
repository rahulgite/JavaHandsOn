package concepts;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jim");
        names.add("Jack");

        ListIterator<String> iterator = names.listIterator();

        // Iterate forwards
        System.out.println("Iterating forwards:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.add("Hello");
        }
        // Iterate backwards
        System.out.println("\nIterating backwards:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

