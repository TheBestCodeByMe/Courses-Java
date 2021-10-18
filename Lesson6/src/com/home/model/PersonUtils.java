package com.home.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonUtils {
    public List<Person> addPerson() {
        Scanner scanner = new Scanner(System.in);
        List<Person> personRegistry = new ArrayList<>();
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        String name;
        int age;
        String sex;
        String country, city;


        System.out.println("Введите имя призывника: ");
        name = scanner.next();

        System.out.println("Введите возраст призывника: ");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число! Введите повторно: ");
                scanner.next();
            }
            age = scanner.nextInt();
        } while (age <= 0);

        System.out.println("Введите пол призывника: ");
            /*do {
                String enter = scanner.next();
                if (!enter.equalsIgnoreCase("Мужчина") || !enter.equalsIgnoreCase("Женщина")) {
                    System.out.println("Вы ввели пол, который не существует! Введите мужчина или женщина: ");
                } else {
                    break;
                }
            } while (true);*/
        sex = scanner.next();
        // Подумаю над этим, пока нет времени

        System.out.println("Введите страну: ");
        country = scanner.next();

        System.out.println("Введите город: ");
        city = scanner.next();

        personRegistry.add(new Person(
                name,
                age,
                sex,
                new Adress(country, city)
        ));
        return personRegistry;
    }
}
