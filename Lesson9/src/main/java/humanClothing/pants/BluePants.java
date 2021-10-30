package humanClothing.pants;

public class BluePants implements IPants {
    public BluePants() {
    }

    @Override
    public void putOn() {
        System.out.println("Голубые штаны надеты.");
    }

    @Override
    public void takeOff() {
        System.out.println("Голубые штаны сняты.");
    }
}
