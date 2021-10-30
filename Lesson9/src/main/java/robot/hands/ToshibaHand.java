package robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку от Toshiba.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
