package concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            al.add(i);

        Iterator<Integer> itr = al.iterator();

        System.out.println(itr.next());
        al.add(11);
        System.out.println(itr.next());
    }
}
