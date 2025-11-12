package day_17.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo_1 {
    static AtomicInteger counter = new AtomicInteger(0);
    static int counterSync = 0;

    public static void increment() {
        for (int i = 0; i < 10000; i++) {
            counter.getAndIncrement();
        }
    }

    public synchronized static void incrementSync() {
        for (int i = 0; i < 10000; i++) {
            counterSync++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            increment();
        });
        Thread t2 = new Thread(() -> {
            increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
//        System.out.println(counterSync);
        System.out.println(counter);
    }
}
