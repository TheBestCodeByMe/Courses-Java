package com.home.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MilitaryOffice {
    private List<Person> personRegistry;

    public void printAbleBoilied() {
        System.out.println("Годные призывники: ");
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() < 27 && person.getSex().equalsIgnoreCase("Мужчина")) {
                System.out.println(person.getName());
            }
        }
        System.out.println();
    }

    public void printAmountMinsk() {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getAdress().get(1).equalsIgnoreCase("Минск") && person.getAge() >= 18 && person.getAge() < 27 && person.getSex().equalsIgnoreCase("Мужчина")) {
                amount++;
            }
        }
        System.out.println("Количество годных призывников из Минска = " + amount);
        System.out.println();
    }

    public void printAmount2527() {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() < 27) {
                amount++;
            }
        }
        System.out.println("Количество призывников от 25 до 27 = " + amount);
        System.out.println();
    }

    public void printAmountAlexandr() {
        //будет количество годных Alexandr
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getName().equalsIgnoreCase("Александр")) {
                amount++;
            }
        }
        System.out.println("Количество призывников с именем Александр = " + amount);
        System.out.println();
    }

    public MilitaryOffice(List<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }
}
