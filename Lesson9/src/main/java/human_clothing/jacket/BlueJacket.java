package human_clothing.jacket;

public class BlueJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надета голубая куртка.");
    }

    @Override
    public void takeOff() {
        System.out.println("Голубая куртка снята.");
    }
}
