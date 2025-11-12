package day_17.multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Demo_3 {
    //    Fork/Join framework
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        SumTask task = new SumTask(array, 0, array.length - 1);

        ForkJoinPool pool = new ForkJoinPool();

        int sum = pool.invoke(task);

        System.out.println(sum);
    }
}

class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 20;
    private int[] array;
    private int start;
    private int end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            return sum();
        } else {
            int middle = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, middle);
            SumTask rightTask = new SumTask(array, middle, end);

            leftTask.fork();

            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }

    private int sum() {
        int total = 0;
        for (int i = start; i < end; i++) {
            total = total + array[i];
        }
        return total;
    }
}