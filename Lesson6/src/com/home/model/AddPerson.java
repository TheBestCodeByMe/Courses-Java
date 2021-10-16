package com.home.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddPerson {
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        List<Person> personRegistry = new ArrayList<>();
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        String name;
        int age;
        String sex;
        String approval;
        String country, city;

        do {
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
            sex = scanner.next();
            // Хотела проверить, но что-то пошло не так, оно почему-то требует вводить 2 раза минимум..
            // Пробовала разными способами, это последний, который пробовала, везде 1 ошибка, что не так?
            /*
            while (true) {
                String enter = scanner.next();
                if (!enter.equalsIgnoreCase("Мужчина") || !enter.equalsIgnoreCase("Женщина")) {
                    System.out.println("Вы ввели пол, который не существует! Введите мужчина или женщина: ");
                    scanner.next();
                } else {
                    break;
                }
            }
            */

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
    }
}
