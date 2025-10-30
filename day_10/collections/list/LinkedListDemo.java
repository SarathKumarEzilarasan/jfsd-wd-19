package day_10.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // data structure -> create add read update delete search
        List<Integer> list = new LinkedList<>();

        list.add(100);
        list.set(0,200);
        list.remove(0);

        System.out.println(list.get(0));
        list.size();





    }
}
