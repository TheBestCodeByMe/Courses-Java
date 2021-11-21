import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarHw5 {

    private String brand;
    private int maxSpeed;
    private int price;

    public CarHw5(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Это автомобиль " +
                "марки " + brand + ". " +
                "Максимальная скорость составляет " + maxSpeed + " км/ч. " +
                "Цена " + price + " $.";
    }
}
