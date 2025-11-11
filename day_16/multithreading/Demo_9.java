package day_16.multithreading;

public class Demo_9 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("child thread");
        });

        t.setDaemon(true);
        t.start();
        System.out.println("main thread");
    }
}
