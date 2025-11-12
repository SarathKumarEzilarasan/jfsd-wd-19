package day_17.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo_5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> "result")
                .thenApply(result -> "Hello" + result)
                .exceptionally(ex -> {
                    ex.printStackTrace();
                    return "exception";
                });
    }

    private static void thenCombine() throws InterruptedException, ExecutionException {
        CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 80.0;
        });

        CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 172.1;
        });

        System.out.println("Calculating BMI");

        CompletableFuture<Double> combinedFuture = weightInKgFuture.thenCombine(heightInCmFuture, (weightInKg, heightIn) -> {
            Double heightInMeter = heightIn / 100;
            return weightInKg / (heightInMeter * heightInMeter);
        });

        System.out.println(combinedFuture.get());
    }

    private static void thenApply() throws InterruptedException, ExecutionException {
//        CompletableFuture<String> nameFuture = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            return "Java";
//        });
//
//
//        CompletableFuture<String> greetingFuture = nameFuture.thenApply(name -> "Hello " + name);

        CompletableFuture<String> nameFuture = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Java";
                }).thenApply(name -> "Hello " + name)
                .thenApply(name -> "Hello " + name);

        System.out.println(nameFuture.get());
    }

    private static void supplyAsync() throws InterruptedException, ExecutionException {
        Executor executor = Executors.newFixedThreadPool(2);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "from child thread";
        }, executor);

        System.out.println(future.get());
    }

    private static void runAsync() throws InterruptedException, ExecutionException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(future.get());
    }
}
