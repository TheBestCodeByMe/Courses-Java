package store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Store {
    private ArrayList<Product> listProducts = new ArrayList<>();

    public void addProduct(Product product) {
        if (checkId(product.getId())) {
            listProducts.add(product);
        }
    }

    public ArrayList<Product> allProduct() {
        return listProducts;
    }

    public void deleteProduct(int id) {
        listProducts.removeIf(product -> product.getId() == id);
    }

    public void editProduct(Product product) {
        if (!checkId(product.getId())) {
            for (Product products : listProducts) {
                if (products.getId() == product.getId()) {
                    products.setName(product.getName());
                    products.setPrice(product.getPrice());
                    // listProducts.set(listProducts.indexOf(product.getId()), product);
                }
            }
        }
    }

    public boolean checkId(int id) {
        if (!listProducts.isEmpty()) {
            return listProducts.stream().noneMatch(product -> product.getId() == id);
        } else {
            return true;
        }
    }
}
