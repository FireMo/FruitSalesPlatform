import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
//        String a = "abc";
//        String b = "abc";
//        System.out.println(a == b);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("li",4);
        map.put("li",4);
        System.out.println(map.get("li"));

    }


}
