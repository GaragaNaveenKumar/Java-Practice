import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> s=new HashMap<>();
        s.put("N",20);
        s.put("M",25);
        s.put("X",24);
        s.put("Y",28);

        for(String key:s.keySet()){
            System.out.println(key +" : "+s.get(key));
        }
        System.out.println(s.hashCode());
    }
}
