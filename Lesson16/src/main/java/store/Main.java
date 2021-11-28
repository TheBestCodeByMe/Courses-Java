package store;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product apple = new Product(1, "apple", 699);
        Product pear = new Product(2, "pear", 777);
        Product smartphone = new Product(3, "smartphone", 10000);
        Product strawberry = new Product(4, "strawberry", 60);
        Product calculate = new Product(5, "calculate", 83);

        store.addProduct(apple);
        store.addProduct(pear);
        store.addProduct(smartphone);
        store.addProduct(strawberry);
        store.addProduct(calculate);

        viewProducts(store);

        store.deleteProduct(4);

        viewProducts(store);

        Product newApple = new Product(1, "Apple", 699);
        store.editProduct(newApple);

        viewProducts(store);
    }

    private static void viewProducts(Store store) {
        ArrayList<Product> products = store.allProduct();

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
