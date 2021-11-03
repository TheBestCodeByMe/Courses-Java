package human_clothing.shoes;

public class BlackShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Чёрная обувь надета.");
    }

    @Override
    public void takeOff() {
        System.out.println("Чёрная обувь снята.");
    }
}
