package cosmodrome.ships;

import cosmodrome.start.IStart;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean check() {
        Random random = new Random();
        return random.nextInt(11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла.");
    }
}
