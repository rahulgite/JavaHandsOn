package Threads.ThreadCreation;

public class ExtendingThread {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

