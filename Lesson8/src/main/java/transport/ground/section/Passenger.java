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

        time = 900;
        System.out.println("За время " +
                time + " ч, автомобиль " +
                super.getBrand() + ", двигаясь с максимальной скоростью " +
                super.getMaxSpeed() + " км/ч, проедет " +
                getWay(time) + " км и израсходует " +
                getFuel(getWay(time)) + " литров топлива.");
    }

    private double getWay(int time) {
        double way;
        way = time * super.getMaxSpeed();
        return way;
    }

    private double getFuel(double way) {
        return way/100;
    }
}