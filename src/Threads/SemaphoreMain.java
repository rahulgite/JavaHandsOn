package Threads;

import java.util.concurrent.Semaphore;

class Connection {
    private static Connection instance = new Connection();
    private int connections = 0;
    private Semaphore sem = new Semaphore(10);

    private Connection() {}

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {}
        try {
            doConnect();
        } finally {
            sem.release();
        }
    }

    private void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        synchronized (this) {
            connections--;
        }
    }
}

class ClientThread extends Thread {
    @Override
    public void run() {
        Connection.getInstance().connect();
    }
}

public class SemaphoreMain {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            ClientThread t = new ClientThread();
            t.start();
        }
    }
}
