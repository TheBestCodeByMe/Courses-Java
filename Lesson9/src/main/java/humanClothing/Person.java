package humanClothing;

import humanClothing.jacket.IJacket;
import humanClothing.pants.IPants;
import humanClothing.shoes.IShoes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Person(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
        System.out.println();
    }

    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
        System.out.println();
    }
}
