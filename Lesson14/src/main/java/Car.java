import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Car implements Serializable {
    private String brand;
    private String typeEngine;
    private transient int numberOfCylinders;
    private String fuelType;
    private int volume;
    private int maxSpeed;
    private int price;

    public Car(String brand, String typeEngine, int numberOfCylinders, String fuelType, int volume, int maxSpeed, int price) {
        this.brand = brand;
        this.typeEngine = typeEngine;
        this.numberOfCylinders = numberOfCylinders;
        this.fuelType = fuelType;
        this.volume = volume;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car:" +
                "brand='" + brand +
                ", typeEngine=" + typeEngine +
                ", numberOfCylinders=" + numberOfCylinders +
                ", fuelType=" + fuelType +
                ", volume=" + volume +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price;
    }
}