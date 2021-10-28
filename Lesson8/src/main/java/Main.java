import transport.air.section.Civil;
import transport.air.section.Military;
import transport.ground.section.Cargo;
import transport.ground.section.Passenger;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = Passenger.builder()
                .numberPassenger(30)
                .type("type1")
                .brand("Audi")
                .fuelrate(90)
                .power(700)
                .maxSpeed(300)
                .weight(6000)
                .numberWheels(4)
                .build();
        passenger.definition();
        passenger.getWay(603);
        System.out.println();

        Cargo cargo = Cargo.builder()
                .tonnage(900)
                .brand("МАЗ")
                .fuelrate(90)
                .power(700)
                .maxSpeed(130)
                .weight(60000)
                .numberWheels(8)
                .build();
        cargo.definition();
        cargo.isPossibleLoad(306);
        cargo.isPossibleLoad(903);
        System.out.println();

        Civil civil = Civil.builder()
                .businessClass(true)
                .brand("Airbus")
                .numberPassenger(99)
                .power(700)
                .maxSpeed(2400)
                .weight(60000)
                .minRunwayLen(600)
                .wingspan(64)
                .build();
        civil.definition();
        civil.isPossibleLoad(80);
        civil.isPossibleLoad(100);
        System.out.println();

        Military military = Military.builder()
                .ejections(true)
                .brand("СУ-24")
                .numberRocket(1)
                .power(700)
                .maxSpeed(2400)
                .weight(60000)
                .minRunwayLen(600)
                .wingspan(64)
                .build();
        military.definition();
        military.shot();
        military.shot();
        military.isHaveEjection();
    }
}
