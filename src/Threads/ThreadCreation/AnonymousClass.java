package Threads.ThreadCreation;

public class AnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        });
        thread.start();

        ///java 17 feature multiline string
        String query = """
                SELECT * FROM users
                WHERE id = 1
                """;
        System.out.println(query);
    }
}
