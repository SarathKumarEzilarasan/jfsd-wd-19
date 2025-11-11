package day_16.multithreading;

public class Demo_5 {
    // deadlock
    public static void main(String[] args) throws InterruptedException {
        Thread mt = Thread.currentThread();
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("from child thread");
                try {
                    mt.join();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("from main thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
