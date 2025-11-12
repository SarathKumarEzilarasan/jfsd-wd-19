package day_17.multithreading;

public class Demo_7 {

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            threadLocal.set((int) (Math.random() * 100D));
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);


        t1.start();
        t2.start();
        t3.start();
    }
}
