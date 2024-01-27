package playground._25_create_and_execute_threads.thread_join_question;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello Threading World!");

        });

        t1.start();
        t1.join();// n2

        System.out.println("Thread launched!");// n1

    }
}
