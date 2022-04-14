package Concurrency.SynchronizeVsAsynchronize;

public class TestAsynchronize {
    public TestAsynchronize() {
    }
    public static class Test {
        public Test() {
        }

        public static void main(String[] args) {
            Table obj = new Table();
            Table obj2 = new Table();
            MyThread1 t1 = new MyThread1(obj);
            MyThread2 t2 = new MyThread2(obj2);
            t1.start();
            t2.start();
        }
    }

    static class MyThread2 extends Thread {
        Table t;

        MyThread2(Table t) {
            this.t = t;
        }

        @Override
        public void run() {
            super.run();
            this.t.printTable(100);
        }

        //        public void run() {
//            this.t.printTable(100);
//        }
    }

    static class MyThread1 extends Thread {
        Table t;

        MyThread1(Table t) {
            this.t = t;
        }

        @Override
        public void run() {
            super.run();
            this.t.printTable(5);
        }

        //        public void run() {
//            this.t.printTable(5);
//        }
    }

    static class Table {
        Table() {
        }

        void printTable(int n) {
            for(int i = 1; i <= 5; ++i) {
                System.out.println(n * i);
            }

        }
    }
}
