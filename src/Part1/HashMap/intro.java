package Part1.HashMap;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
//      its order is not fixed
        hm.put("india", 300);
        hm.put("usa", 322);
        hm.put("japan", 100);
//        System.out.println(hm);
        hm.put("nigeria", 857);
        hm.put("india", 400);
//        System.out.println(hm);
//
//        System.out.println(hm.get("india"));
//        System.out.println(hm.get("usa"));
//        System.out.println(hm.get("endian"));
//
//        System.out.println(hm.containsKey("india"));
//        System.out.println(hm.containsKey("uhih"));

        Set <String> key = hm.keySet(); // -> gives a set of keys in array form
        System.out.println(key);

        for(String keys: hm.keySet()){
//            Integer val = hm.get(keys);
            System.out.println(keys + " \t");
        }

    }
}
