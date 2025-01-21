package Threads;

class SharedResource {
    private int value = 0;
    private boolean produced = false;

    // Producer method
    public synchronized void produce() {
        while (produced) {
            try {
                wait(); // Wait until the consumer consumes the value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        value++;
        System.out.println("Produced: " + value);
        produced = true;
        notify(); // Notify the consumer that a value has been produced
    }

    // Consumer method
    public synchronized void consume() {
        while (!produced) {
            try {
                wait(); // Wait until the producer produces a value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + value);
        produced = false;
        notify(); // Notify the producer that the value has been consumed
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
