package store;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // А как лучше реализовать сортировку, что-то упустила этот момент?
        Store store = new Store();
        Product apple = new Product(1, "apple", 699);
        Product pear = new Product(2, "pear", 777);
        Product smartphone = new Product(3, "smartphone", 10000);
        Product strawberry = new Product(4, "strawberry", 60);
        Product calculate = new Product(5, "calculate", 83);

        System.out.println(store.addProduct(apple));
        System.out.println(store.addProduct(pear));
        System.out.println(store.addProduct(smartphone));
        System.out.println(store.addProduct(strawberry));
        System.out.println(store.addProduct(calculate));

        viewProducts(store);

        store.deleteProduct(4);

        viewProducts(store);

        Product newApple = new Product(1, "Apple", 699);
        store.newProduct(newApple);

        viewProducts(store);
    }

    private static void viewProducts(Store store) {
        List<Product> products = store.getAllProducts();
        products.stream()
                .toList()
                .forEach(System.out::println);
    }
}
