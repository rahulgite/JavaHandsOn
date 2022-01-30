import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetLineNoOfWordFromParagraph {
    public static void main(String[] args) {
        String para="hey \n hello \n I am \n Rahul";
        String a[]=para.split("\\n");
        System.out.println(
                IntStream.range(0, para.split("\\n").length).filter(e->a[e].contains("am")).findFirst().getAsInt()+1);

    }
}
