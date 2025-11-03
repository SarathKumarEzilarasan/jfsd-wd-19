package day_12;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<>(new DecendingComparator());
//        Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        Map<String, Integer> map = new TreeMap<>();
        map.put("john", 20);
        map.put("peter", 1);
        map.put("zack", 10);

//        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);

        System.out.println(list);
        Collections.sort(list, new ValueComparator());
        System.out.println(list);

    }
}

class DecendingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}


class ValueComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}