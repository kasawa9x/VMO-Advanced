package Concurrency.ThreadPools;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolsDemo {
    public static void main(String[] args)
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++)
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());

            executor.execute(task);
        }
        executor.shutdown();// need call shutdown to finish loop
        while (!executor.isTerminated()){

        }
        System.out.println("submit all tasks ........");
    }
}
