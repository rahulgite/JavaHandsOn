package Threads.ThreadCreation;

public class ImplementingRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}