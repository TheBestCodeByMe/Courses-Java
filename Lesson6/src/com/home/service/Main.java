package com.home.service;

import com.home.model.MilitaryOffice;
import com.home.model.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personRegistry = new ArrayList<>();
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        String name;
        int age;
        String sex;
        //String[] adress = new String[2];
        String approval;
        List<String> adress = new ArrayList<>();

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

            System.out.println("Введите пол призывника: "); // Проверку на пол нужно было делать?
            sex = scanner.next();

            System.out.println("Введите страну: ");
            adress.add(0, scanner.next());
            //adress[0] = scanner.next();
            //str = scanner.next();

            System.out.println("Введите город: ");
            adress.add(1, scanner.next());
            //adress[1] = scanner.next();
            //gorod = scanner.next();

            personRegistry.add(new Person(
                    name,
                    age,
                    sex,
                    adress
                    //new Adress(str, gorod)
            ));

            System.out.println("Вы хотите ввести ещё одного? Введите да, если да: ");
            approval = scanner.next();
        } while (approval.equalsIgnoreCase("yes"));

        militaryOffice.printAbleBoilied();
        militaryOffice.printAmountMinsk();
        militaryOffice.printAmount2527();
        militaryOffice.printAmountAlexandr();
    }
}
