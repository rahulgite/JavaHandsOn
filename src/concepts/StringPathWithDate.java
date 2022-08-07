package concepts;//write a program that takes the string input “manual/abc.txt” and
// returns the output string in the format “manual/todays_date/abc.txt”
import java.time.LocalDateTime;

public class StringPathWithDate {
    public static void main(String[] args) {
        System.out.println(getDatePath("lite/manual/abc.txt"));
    }
    static String getDatePath(String path){
        String a[]=path.split("/");
        path=path.replace(a[a.length-1], LocalDateTime.now().toLocalDate().toString()+"/"+a[a.length-1]);
        return path;
    }
}
/*
lite/manual/2022-01-30/abc.txt
 */