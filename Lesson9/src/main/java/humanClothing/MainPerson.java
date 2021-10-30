package humanClothing;

import humanClothing.jacket.BlueJacket;
import humanClothing.jacket.GreenJacket;
import humanClothing.pants.BlackPants;
import humanClothing.pants.BluePants;
import humanClothing.shoes.BlackShoes;
import humanClothing.shoes.YellowShoes;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Alexandr", new GreenJacket(), new BlackPants(), new BlackShoes());
        Person person2 = new Person("Katya", new BlueJacket(), new BluePants(), new BlackShoes());
        Person person3 = new Person("Andrey", new BlueJacket(), new BlackPants(), new YellowShoes());

        person1.putOn();
        person2.putOn();
        person3.putOn();

        person3.takeOff();
        person2.takeOff();
        person1.takeOff();
    }
}
