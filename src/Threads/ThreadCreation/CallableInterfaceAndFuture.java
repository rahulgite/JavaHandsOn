package Threads.ThreadCreation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfaceAndFuture {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> "Task is completed!";

        Future<String> future = executor.submit(task);

        System.out.println(future.get());

        executor.shutdown();
    }
}
