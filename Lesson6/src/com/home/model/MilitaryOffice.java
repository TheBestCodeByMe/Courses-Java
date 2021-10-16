package com.home.model;

import com.home.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    List<Person> personRegistry;

    Constants constans = new Constants();

    public MilitaryOffice(List<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }

    public List<String> printAbleBoilied() {
        List<String> list = new ArrayList<>();
        for (Person person : personRegistry) {
            if (person.getAge() >= constans.getMinAge() && person.getAge() < constans.getMaxAge() && person.getSex().equalsIgnoreCase(constans.getValidSex())) {
                list.add(person.getName());
            }
        }
        if (list.isEmpty()) {
            list.add("Таких нет");
        }
        return list;
    }

    public int AmountCity(String city) {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getAdress().getCity().equalsIgnoreCase(city) && person.getAge() >= constans.getMinAge() && person.getAge() < constans.getMaxAge() && person.getSex().equalsIgnoreCase(constans.getValidSex())) {
                amount++;
            }
        }
        return amount;
    }

    public int AmountAge(int minAge, int maxAge) {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= minAge && person.getAge() < maxAge) {
                amount++;
            }
        }
        return amount;
    }

    public int AmountName(String name) {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getName().equalsIgnoreCase(name)) {
                amount++;
            }
        }
        return amount;
    }
}
