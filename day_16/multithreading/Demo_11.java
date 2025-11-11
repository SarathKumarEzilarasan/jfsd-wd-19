package day_16.multithreading;

public class Demo_11 {

    volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        ++counter;
    }

    public static void main(String[] args) {
        Demo_11 demo = new Demo_11();

        Thread t1 = new Thread(() -> {
            int oldValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getName() + " Old value = " + oldValue);
            demo.increaseCounter();
            int newValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getName() + " New value = " + newValue);
        });

        Thread t2 = new Thread(() -> {
            int oldValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getName() + " Old value = " + oldValue);
            demo.increaseCounter();
            int newValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getName() + " New value = " + newValue);
        });

        t1.start();
        t2.start();
    }
}
