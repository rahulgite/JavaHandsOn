package Threads.ThreadCreation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> System.out.println("Task 1 is running..."));
        executor.execute(() -> System.out.println("Task 2 is running..."));

        executor.shutdown(); // Shutdown the executor
    }
}
