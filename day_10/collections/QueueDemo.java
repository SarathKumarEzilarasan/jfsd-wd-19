package day_10.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // FIFO -> First In First Out
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

//        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.contains(20));
    }
}
