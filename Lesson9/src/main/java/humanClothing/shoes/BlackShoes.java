package humanClothing.shoes;

public class BlackShoes implements IShoes {
    public BlackShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Чёрная обувь надета.");
    }

    @Override
    public void takeOff() {
        System.out.println("Чёрная обувь снята.");
    }
}
