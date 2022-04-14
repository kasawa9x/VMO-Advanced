package Concurrency.SafetyCollections;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();
        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populatedSoldProduct();
            }
        });
          Thread displayTask = new Thread(new Runnable() {
              @Override
              public void run() {
                  manager.displayProduct();
              }
          });
          inventoryTask.start();
          inventoryTask.join();
//          Thread.sleep(1000);
          displayTask.start();
    }
}
