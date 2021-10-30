package humanClothing.pants;

public class BlackPants implements IPants{
    public BlackPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Чёрные штаны надеты.");
    }

    @Override
    public void takeOff() {
        System.out.println("Чёрные штаны сняты.");
    }
}
