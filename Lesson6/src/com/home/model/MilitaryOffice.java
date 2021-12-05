package com.home.model;

import com.home.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    private List<Person> personRegistry;

    public MilitaryOffice(List<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }

    public List<String> printAbleBoilied() {
        List<String> list = new ArrayList<>();
        for (Person person : personRegistry) {
            if (person.getAge() >= Constants.MIN_AGE && person.getAge() < Constants.MAX_AGE && person.getSex().equalsIgnoreCase(Constants.VALID_SEX)) {
                list.add(person.getName());
            }
        }
        return list;
    }

    public int getPersonsByCity(String city) {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getAdress().getCity().equalsIgnoreCase(city) && person.getAge() >= Constants.MIN_AGE && person.getAge() < Constants.MAX_AGE && person.getSex().equalsIgnoreCase(Constants.VALID_SEX)) {
                amount++;
            }
        }
        return amount;
    }

    public int getPersonsByAge(int minAge, int maxAge) {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= minAge && person.getAge() < maxAge) {
                amount++;
            }
        }
        return amount;
    }

    public int getPersonsByName(String name) {
        int amount = 0;
        for (Person person : personRegistry) {
            if (person.getName().equalsIgnoreCase(name)) {
                amount++;
            }
        }
        return amount;
    }


    public List<Person> getPersonRegistry() {
        return personRegistry;
    }

    public void setPersonRegistry(List<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }
}
