package human_clothing;

import human_clothing.jacket.BlueJacket;
import human_clothing.jacket.GreenJacket;
import human_clothing.pants.BlackPants;
import human_clothing.pants.BluePants;
import human_clothing.shoes.BlackShoes;
import human_clothing.shoes.YellowShoes;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Alexandr", new GreenJacket(), new BlackPants(), new BlackShoes());
        Person person2 = new Person("Katya", new BlueJacket(), new BluePants(), new BlackShoes());
        Person person3 = new Person("Andrey", new BlueJacket(), new BlackPants(), new YellowShoes());

        Person[] mass = {person1, person2, person3};

        for (Person person : mass) {
            person.putOn();
            person.takeOff();
        }
    }
}
