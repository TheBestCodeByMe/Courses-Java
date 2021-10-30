package humanClothing.shoes;

public class YellowShoes implements IShoes{
    public YellowShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Жёлтая обувь надета.");
    }

    @Override
    public void takeOff() {
        System.out.println("Жёлтая обувь снята.");
    }
}
