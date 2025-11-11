package day_16.multithreading;

public class Demo_3 {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Hello");
//        System.out.println(1 / 0);
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("from child thread");
                Thread.yield();////////////////////////////////
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
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
