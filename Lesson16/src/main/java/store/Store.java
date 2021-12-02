package store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Store {
    private List<Product> listProducts = new ArrayList<>();

    public boolean addProduct(Product product) {
        if (checkId(product.getId())) {
            listProducts.add(product);
            return true;
        }
        return false;
    }

    public boolean checkId(int id) {
        return listProducts.stream()
                .noneMatch(product -> product.getId() == id);
    }

    public List<Product> getAllProducts() {
        return listProducts;
    }

    public void deleteProduct(int id) {
        listProducts.removeIf(product -> product.getId() == id);
    }

    public void newProduct(Product products) {
        for (Product product : listProducts) {
            if (product.getId() == products.getId()) {
                product.setName(products.getName());
                product.setPrice(products.getPrice());
                break;
                // listProducts.set(listProducts.indexOf(product.getId()), product);
            }
        }
    }
}
