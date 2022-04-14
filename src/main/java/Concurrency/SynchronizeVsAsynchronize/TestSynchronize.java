package Concurrency.SynchronizeVsAsynchronize;

public class TestSynchronize {


        static void printTable(String name, int n) {
            for (int i = 10;i>=0; i--) {
                System.out.println(name + ": " + (n * i));
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }
        }
    }

class MyThread1 extends Thread {
    private String name;
    public MyThread1(String name) {
        this.name = name;
    }
    public void run() {
        TestSynchronize.printTable(name, 1);
    }
}

    class MyThread2 extends Thread {
        private String name;
        public MyThread2(String name) {
            this.name = name;
        }

        public void run() {
            TestSynchronize.printTable(name, 10);
        }
    }


    class JavaThreadSynchronized1 {

        public static void main(String[] args) {
            MyThread1 t1 = new MyThread1("Thread 1");
            MyThread2 t2 = new MyThread2("Thread 2");
            MyThread1 t3 = new MyThread1("Thread 1(2)");
            t1.start();
            t2.start();
            t3.start();
        }

}
