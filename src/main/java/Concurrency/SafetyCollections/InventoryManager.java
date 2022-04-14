package Concurrency.SafetyCollections;



import java.util.*;

public class InventoryManager {
    List<Product> productList = new ArrayList<Product>();
    List<Product> pProductList = new ArrayList<>();
    public void populatedSoldProduct(){
        for (int i = 0; i < 100; i++) {
            Product product= new Product(i, " test_product_" +i);
            productList.add(product);
            System.out.println("Added: "+ product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void displayProduct(){
        for (Product product: productList
             ) {
            System.out.println("prining the sold" + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }

