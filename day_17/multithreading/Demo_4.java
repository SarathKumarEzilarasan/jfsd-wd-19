package day_17.multithreading;

import java.util.concurrent.*;

public class Demo_4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 0;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(callable);
        System.out.println("doing other work");
        int result = future.get();
        System.out.println(result);
        executorService.shutdownNow();
    }
}
