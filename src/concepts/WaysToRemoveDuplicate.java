package concepts;

import java.util.*;
import java.util.stream.Collectors;

public class WaysToRemoveDuplicate {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jim", "John", "Jane"};

        Set<String> uniqueNames = new LinkedHashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        System.out.println(uniqueNames);
        /////////////////////////////////////////////

        Map<String, Integer> nameMap = new LinkedHashMap<>();
        for (String name : names) {
            nameMap.put(name, 0);
        }

        System.out.println(nameMap.keySet());
        ////////////////////////////////////////////////

        List<String> nameList = new ArrayList<>();
        for (String name : names) {
            if (!nameList.contains(name)) {
                nameList.add(name);
            }
        }

        Map<String, Integer> nameMap1 = new LinkedHashMap<>();
        for (String name : nameList) {
            nameMap1.put(name, 0);
        }

        System.out.println(nameMap1.keySet());
        ////////////////////////////////////////////////

        List<String> uniqueNames2 = Arrays.stream(names)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNames2);

    }
}
