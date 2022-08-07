package concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//given the list of strings as input as below
//[“a:1”, ”b:2”, ”c:3”]
//   	write a program to return a map as follows
//[Key: a, value: 1; Key: b, value: 2; Key: c, value: 3]
public class ProgramStringToMap {
    public static void main(String[] args) {

        String s[]={"a:1","b:2"};
        System.out.println(
                Arrays.stream(s)
                        .map(elem -> elem.split(":"))
                        .filter(elem -> elem.length==2)
                        .collect(Collectors.toMap(e -> e[0], e -> Integer.parseInt(e[1]))));
    }
}
/*
{a=1, b=2}
 */
