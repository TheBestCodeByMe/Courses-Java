package human_clothing.jacket;

public class GreenJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надета зелёная куртка.");
    }

    @Override
    public void takeOff() {
        System.out.println("Зелёная куртка снята.");
    }
}
