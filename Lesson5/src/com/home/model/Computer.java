package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String interpreter;
    int ram;
    String hardDrive;
    int workCycle;
    boolean flag2 = true;

    public Computer(String interpreter, int ram, String hardDrive, int workCycle) {
        this.interpreter = interpreter;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.workCycle = workCycle;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "interpreter = '" + interpreter + '\'' +
                ", ram = " + ram +
                ", hardDrive = '" + hardDrive + '\'' +
                ", workCycle = " + workCycle +
                '}';
    }

    public void on() {
        Random rand = new Random();
        int number, numberRand;

        System.out.println("Вызван метод включения.");

        number = func();
        numberRand = rand.nextInt(2);

        if (number != 2) {
            if (flag2) {
                if (number == numberRand) {
                    off();
                } else {
                    System.out.println("Компьютер сгорел!");
                    flag2 = false;
                }
            } else {
                System.out.println("Компьютер сгорел! Вы не можете повторно его включить!");
            }
        } else {
            System.out.println("Компьютер сгорел");
            flag2 = false;
        }
    }

    public void off() {
        Random rand = new Random();
        int number, numberRand;
        System.out.println("Вызван метод выключения.");

        number = func();
        numberRand = rand.nextInt(2);

        if (number != 2) {
            if (flag2) {
                if (number == numberRand) {
                    on();
                } else {
                    System.out.println("Компьютер сгорел!");
                    flag2 = false;
                }
            } else {
                System.out.println("Компьютер сгорел! Вы не можете повторно его включить!");
            }
        } else {
            System.out.println("Компьютер сгорел");
            flag2 = false;
        }
    }

    public int func() {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true, flag1 = true;
        int number = 2;

        while (flag) {
            System.out.println("Внимание! Введите 0 или 1: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                scanner.next();
            }
            number = scanner.nextInt();

            if (number == 0 || number == 1) {
                flag = false;
                workCycle--;
            } else {
                System.out.println("Это не 0 или 1. Введите другое число!");
            }
        }

        if (workCycle != 0) {
            if (number == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 2;
        }
    }
}
