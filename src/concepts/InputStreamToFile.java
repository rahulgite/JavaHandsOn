package concepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputStreamToFile {
    public static void main(String[] args) throws IOException {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        try {
            Files.write(Paths.get("numbers.txt"),list.stream().map(a->a.toString()).collect(Collectors.toList()));
        }catch (Exception e){
            e.printStackTrace();;
        }

        try (Stream<String> stream = Files.lines(Paths.get("numbers.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
1
2
3
4
5
6
7
8
9
10
 */