package day_17.multithreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_6 {
//    HashSet -> CopyOnWriteArraySet
//    LinkedList -> ConcurrentLinkedQueue
//    TreeMap -> ConcurrentSkipListMap

    public static void main(String[] args) throws InterruptedException {
        List<Integer> nonThreadSafeList = new ArrayList<>();
        List<Integer> threadSafeList = new CopyOnWriteArrayList<>();

        runTest(nonThreadSafeList);
        runTest(threadSafeList);
    }

    private static void runMap() throws InterruptedException {
        Map<Integer, Integer> nonThreadSafeMap = new HashMap<>();
        Map<Integer, Integer> threadSafeMap = new ConcurrentHashMap<>();

        runTest(nonThreadSafeMap);
        runTest(threadSafeMap);
    }

    private static void runTest(List<Integer> list) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            executorService.submit(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add(finalI * 1000 + j);
                }
            });
        }

        executorService.shutdownNow();
        Thread.sleep(1000);
        System.out.println(list.size());
    }

    private static void runTest(Map<Integer, Integer> map) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            executorService.submit(() -> {
                for (int j = 0; j < 1000; j++) {
                    map.put(finalI * 1000 + j, j);
                }
            });
        }

        executorService.shutdownNow();
        Thread.sleep(1000);
        System.out.println(map.size());
    }
}
