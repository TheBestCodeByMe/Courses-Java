package human_clothing.pants;

public class BluePants implements IPants {

    @Override
    public void putOn() {
        System.out.println("Голубые штаны надеты.");
    }

    @Override
    public void takeOff() {
        System.out.println("Голубые штаны сняты.");
    }
}
