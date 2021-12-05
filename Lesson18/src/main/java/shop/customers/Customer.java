package shop.customers;

import shop.Shop;
import shop.cashBox.CashBox;
import shop.strategies.ChooseCashBox;

public class Customer extends Thread {
    private final Shop shop;
    private final String customerName;
    private final String[] shoppingList;
    private final ChooseCashBox strategy;

    public Customer(Shop shop, String customerName, String[] shoppingList, ChooseCashBox strategy) {
        this.shop = shop;
        this.customerName = customerName;
        this.shoppingList = shoppingList;
        this.strategy = strategy;
    }

    @Override
    public void run() {
        CashBox box = strategy.chooseCashBox(customerName, shop.getCashBoxes());
        System.out.println(customerName + " will use CashBox #" + box.getId());
        box.serveCustomer(this);
    }

    public String[] getShoppingList() {
        return shoppingList;
    }

    public String getCustomerName() {
        return customerName;
    }
}
