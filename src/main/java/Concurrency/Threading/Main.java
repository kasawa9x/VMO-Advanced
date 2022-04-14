package Concurrency.Threading;

public class Main extends Thread implements Runnable {
    public static void main(String[] args) {
        //Threading
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread");
        //Starting Threads and the Runnable Interface
        Main obj = new Main();
        Thread thread1 = new Thread(obj);
        thread1.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
