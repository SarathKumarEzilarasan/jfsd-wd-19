package day_10.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Collections -> List , Set , Map
        // data structure -> create add read update delete search
        List<Integer> arrayList = new ArrayList<>(20); // 10 -> 20 -> 40

//        arrayList.add(100);
//        arrayList.add(100);
//
//        arrayList.set(0, 200);
//
//        System.out.println(arrayList.get(0));
//        arrayList.remove(0);
//        System.out.println(arrayList);

        arrayList.add(100);
        arrayList.add(100);

//        for (int i = 0; i < arrayList.size(); i++) {
//            int j = arrayList.get(i);
//            System.out.println(j / 100);
//        }

        //for each
        for (Integer i : arrayList) {
            System.out.println(i);
        }


        System.out.println(arrayList.contains(100));

        arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

//        int[][] arr = {
//                {1, 2},
//                {3, 4}
//        };
//
//        for (int[] a : arr) {
//            for (int i : a) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

    }
}

// Generics