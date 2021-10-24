package com.home.service;

import com.home.model.Adress;
import com.home.model.MilitaryOffice;
import com.home.model.Person;
import com.home.model.PersonUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> personRegistry;
        PersonUtils addPerson = new PersonUtils();

        personRegistry = addPerson.addPerson();

        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        System.out.println("Годные призывники:\n");
        if (militaryOffice.printAbleBoilied().isEmpty()) {
            System.out.println("Таких нет.");
        } else {
            System.out.println(militaryOffice.printAbleBoilied() + "\n");
        }
        System.out.println("Количество годных призывников из Минска = " + militaryOffice.getPersonsByCity("Минск") + "\n");
        int minAge = 25, maxAge = 27;
        System.out.println("Количество призывников от " + minAge + " до " + maxAge + " = " + militaryOffice.getPersonsByAge(minAge, maxAge) + "\n");
        String name1 = "Александр";
        System.out.println("Количество призывников с именем " + name1 + " = " + militaryOffice.getPersonsByName(name1) + "\n");
    }
}
