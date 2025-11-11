package day_16.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Demo_8 {
    public static void main(String[] args) {
        Processor processor = new Processor();

        Thread t1 = new Thread(() -> {
            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                processor.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}

class Processor {
    private List<Integer> list = new ArrayList<>();
    private final int LIMIT = 5;
    private final int BOTTOM = 0;
    private int value = 0;
    private final Object obj = new Object();


    public void producer() throws InterruptedException {
        synchronized (obj) {
            while (true) {
                if (list.size() == LIMIT) {
                    System.out.println("Waiting for removing items from the list....");
                    obj.wait();
                } else {
                    System.out.println("Adding: " + value);
                    list.add(value);
                    value++;
                    obj.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (obj) {
            while (true) {
                if (list.size() == BOTTOM) {
                    System.out.println("Waiting for adding items from the list....");
                    obj.wait();
                } else {
                    System.out.println("Removed: " + list.remove(--value));
                    obj.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}
