package day_16.multithreading;

public class Demo_6 {
    // deadlock
    public static void main(String[] args) throws InterruptedException {
        Thread mt = Thread.currentThread();
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("from child thread");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("i am awake");
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.interrupt();
        System.out.println("end of main");
    }
}
