package day_16.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo_10 {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        lock.lock();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        lock.unlock();
    }
}
