import java.util.HashMap;

public class MapKeyTwice {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("tree",1);
        map.put("tree",2);

        System.out.println(map);
    }
}
