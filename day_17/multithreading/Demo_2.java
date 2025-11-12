package day_17.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo_2 {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 10; i++) {
//            executorService.submit(() -> {
//                System.out.println(Thread.currentThread().getName());
//            });
//        }

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(
                () -> System.out.println(Thread.currentThread().getName()),
                0,
                1000,
                TimeUnit.MILLISECONDS);
        Thread.sleep(3000);
        executorService.shutdownNow();
    }
}
