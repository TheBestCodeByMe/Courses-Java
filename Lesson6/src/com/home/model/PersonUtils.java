package com.home.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonUtils {
    public List<Person> addPerson() {
        Scanner scanner = new Scanner(System.in);
        List<Person> personRegistry = new ArrayList<>();
        String name;
        int age;
        String sex;
        String country, city;
        String approval;

        do {
            System.out.println("Введите имя призывника: ");
            name = scanner.next();

            System.out.println("Введите возраст призывника: ");
            while (true) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не число! Введите повторно: ");
                    scanner.next();
                }
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Число должно быть положительным! Введите число, которое больше 0: ");
                } else {
                    break;
                }
            }

            System.out.println("Введите пол призывника: ");
            do {
                sex = scanner.next();
                if (sex.equals("Мужчина") || sex.equals("Женщина")) {
                    break;
                } else {
                    System.out.println("Вы ввели пол, которого не существует! Введите мужчина или женщина: ");
                }
            } while (true);

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
            System.out.println("Вы хотите ввести ещё одного? Введите да, если да: ");
            approval = scanner.next();
        } while (approval.equalsIgnoreCase("да"));
        return personRegistry;
    }
}
