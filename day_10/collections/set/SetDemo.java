package day_10.collections.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // data structure -> create add read update delete search

//        Set<Integer> set = new HashSet<>();
//        set.add(100);
//        set.add(200);
//        set.add(100);
//
////        set.get();
//        set.remove(100);
////        System.out.println(set.contains(200));
//
//
////        for (int i:set){
////            System.out.println(i);
////        }
//
//        List<Integer> list = new ArrayList<>(set);
//        System.out.println(list.get(0));



        Set<String> set = new TreeSet<>();
        // Hashing -> j*10(3) + o*10(2) + h*10(1) + n*10(0) --> 10002

        set.add("zack");
        set.add("anand");
        set.add("john");

        System.out.println(set);
    }
}
