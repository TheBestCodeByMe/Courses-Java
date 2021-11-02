package human_clothing.pants;

public class BlackPants implements IPants{

    @Override
    public void putOn() {
        System.out.println("Чёрные штаны надеты.");
    }

    @Override
    public void takeOff() {
        System.out.println("Чёрные штаны сняты.");
    }
}
