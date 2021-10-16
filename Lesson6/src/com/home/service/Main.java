package com.home.service;

import com.home.model.AddPerson;
import com.home.model.MilitaryOffice;
import com.home.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personRegistry = new ArrayList<>();
        AddPerson addPerson = new AddPerson();
        addPerson.addPerson();

        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        // Не могу понять, помогииииите, хаха, как вызвать функции этого класса без заполнения
        // класса отсюда
        // Если добавлять с main, то всё работает, если с отдельного класса, то из-за
        // инициализации класса милитэриОфис пустой

        System.out.println("Годные призывники:\n"+ militaryOffice.printAbleBoilied() + "\n");
        System.out.println("Количество годных призывников из Минска = " + militaryOffice.AmountCity("Минск") + "\n");
        int minAge = 25, maxAge = 27;
        System.out.println("Количество призывников от " + minAge + " до " + maxAge + " = " + militaryOffice.AmountAge(minAge, maxAge) + "\n");
        String name1 = "Александр";
        System.out.println("Количество призывников с именем " + name1 + " = " + militaryOffice.AmountName(name1) + "\n");
    }
}
