package transport.ground.section;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.Transport;
import transport.ground.GroundTransport;

@Getter
@Setter
@SuperBuilder
public class Passenger extends GroundTransport {
    private String type;
    private int numberPassenger;
    private int time;

    @Override
    public void definition() {
        super.definition();
        System.out.println(
                "\nТип кузова - " + type +
                "\nКоличество пассажиров - " + numberPassenger + "\n");

        System.out.println("За время " +
                time + " ч, автомобиль " +
                super.getBrand() + ", двигаясь с максимальной скоростью " +
                super.getMaxSpeed() + " км/ч, проедет " +
                getWay(time) + " км и израсходует " +
                getFuel(getWay(time)) + " литров топлива.");
    }

    public double getWay(int time) {
        this.time = time;
        double way;
        way = time * super.getMaxSpeed();
        return way;
    }

    private double getFuel(double way) {
        return way/100; //та вроде же так
        // если 1 литр - 100 км
        // а нужный Х  - way км
        // там же расход литр на 100 км, нет?
    }
}