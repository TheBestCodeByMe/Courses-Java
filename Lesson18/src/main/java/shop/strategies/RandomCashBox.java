package shop.strategies;

import shop.cashBox.CashBox;

import java.util.Random;

public class RandomCashBox implements ChooseCashBox {
    private final Random random = new Random();

    @Override
    public CashBox chooseCashBox(String customerName, CashBox[] cashBoxes) {
        System.out.println(customerName + " picking CashBox randomly");
        return cashBoxes[random.nextInt(cashBoxes.length)];
    }
}
