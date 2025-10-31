package day_10.collections.map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // data structure -> create add read update delete search
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("john", 123);
//        map.put("peter", 321);
//        map.put("adam", 231);
//        map.put("john", 231);
//
//        System.out.println(map);


//        System.out.println(map.get("john"));
//        map.remove("john");
//        System.out.println(map.containsKey("john"));
//        System.out.println(map.containsValue(321));

//        Set<String> keys = map.keySet();
//
//        for (String key : keys) {
//            System.out.println(key);
//        }

//        Collection<Integer> values = map.values();
//
//        for (Integer value:values){
//            System.out.println(value);
//        }

//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        charFrequency("wwwaacdddd");
    }

    // wwwaacdddd -> w3a2c1d4
    public static void charFrequency(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                int oldValue = map.get(key);
                map.put(key, oldValue + 1);
            } else {
                map.put(key, 1); // w,1
            }
        }
        System.out.println(map);
    }
}
