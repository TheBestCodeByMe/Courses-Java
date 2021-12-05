package shop.strategies;

import shop.cashBox.CashBox;

public interface ChooseCashBox {
    CashBox chooseCashBox(String customerName, CashBox[] cashBoxes);
}
