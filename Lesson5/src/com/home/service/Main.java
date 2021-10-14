package com.home.service;

import com.home.model.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String interpreter = "single-chip";
        int ram = 8;
        String hardDrive = "SSD";
        int workCycle = 6;
        int number = 1;
        Scanner scanner = new Scanner(System.in);

        Computer comp = new Computer(interpreter, ram, hardDrive, workCycle);

        //System.out.println(comp.toString());

while(number == 1) {
    System.out.println("Вы хотите включить компьютер снова? Введите 1, если  да: ");

    while (!scanner.hasNextInt()) {
        System.out.println("Вы ввели не число!");
        scanner.next();
    }
    number = scanner.nextInt();

    if (number == 1) {
        comp.on();
    } else {number = 0;}
}
    }
}
