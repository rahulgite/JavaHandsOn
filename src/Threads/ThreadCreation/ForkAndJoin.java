package Threads.ThreadCreation;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkAndJoin {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(1, 100);

        int result = pool.invoke(task);
        System.out.println("Sum: " + result);
    }
}

class SumTask extends RecursiveTask<Integer> {
    private int start, end;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(start, mid);
            SumTask rightTask = new SumTask(mid + 1, end);

            leftTask.fork();
            rightTask.fork();

            return leftTask.join() + rightTask.join();
        }
    }
}

// Sum: 5050