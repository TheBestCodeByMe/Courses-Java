package cosmodrome.ships;

import cosmodrome.start.IStart;

import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart {
    @Override
    public boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запустить, если хотите запустить SpaceX.");
        String check = scanner.next();
        return check.equalsIgnoreCase("Запустить");
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX.");
    }
}
