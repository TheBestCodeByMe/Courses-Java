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

    /*
        public Passenger(String carBrand, int power, int  maxSpeed, int weight, String type, int numberPassenger) {
            super(carBrand, power, maxSpeed, weight);
            this.type = type;
            this.numberPassenger = numberPassenger;
        }
    */
    // Не совсем поняла, что должно быть в методе описания
    // поэтому вывела просто характеристики этого объекта
    @Override
    public void definition() {
        System.out.println("Марка машины - " + super.getBrand() +
                "\nМощность - " + getNewPower() + " кВ" +
                "\nМаксимальная скорость - " + super.getMaxSpeed() + " км/ч" +
                "\nМасса - " + super.getWeight() + " кг" +
                "\nТип кузова - " + type +
                "\nКоличество колёс - " + super.getNumberWheels() +
                "\nРасход топлива - " + super.getFuelrate() + " л/100км"+
                "\nКоличество пассажиров - " + numberPassenger + "\n");
    }

    private double getNewPower() {
        double power;
        power = super.getPower() * 0.74;
        return power;
    }

    public double getWay(int time) {
        double way;
        way = time * super.getMaxSpeed();
        System.out.println("За время " +
                time + " ч, автомобиль " +
                super.getBrand() + ", двигаясь с максимальной скоростью " +
                super.getMaxSpeed() + " км/ч, проедет " +
                way + " км и израсходует " +
                getFuel(way) + " литров топлива.");
        return way;
    }

    private double getFuel(double way) {
        double fuel;
        fuel = way / 100;
        return fuel;
    }
}