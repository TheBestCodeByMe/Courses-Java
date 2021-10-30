package humanClothing.jacket;

public class BlueJacket implements IJacket {
    public BlueJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надета голубая куртка.");
    }

    @Override
    public void takeOff() {
        System.out.println("Голубая куртка снята.");
    }
}
