package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String interpreter;
    private int ram;
    private String hardDrive;
    private int workCycle;
    private boolean burned = false;

    public Computer(String interpreter, int ram, String hardDrive, int workCycle) {
        this.interpreter = interpreter;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.workCycle = workCycle;
    }

    public void on() {
        System.out.println("Вызван метод включения.");
        boolean flag;

        flag = checkAction();
        if (!burned) {
            if (flag) {
                off();
                workCycle--;
            } else {
                System.out.println("Компьютер сгорел!");
                workCycle--;
                burned = true;
            }
        } else {
            System.out.println("Компьютер сгорел! Вы не можете повторно его включить!");
        }
    }

    public void off() {
        System.out.println("Вызван метод выключения.");
        boolean flag;

        flag = checkAction();
            if (!burned) {
                if (flag) {
                    on();
                    workCycle--;
                } else {
                    System.out.println("Компьютер сгорел!");
                    workCycle--;
                    burned = true;
                }
            } else {
                System.out.println("Компьютер сгорел! Вы не можете повторно его включить!");
            }
    }

    public boolean checkAction() {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int number = 2;
        Random rand = new Random();
        int numberRand;

        while (flag) {
            System.out.println("Внимание! Введите 0 или 1: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                scanner.next();
            }
            number = scanner.nextInt();

            if (number == 0 || number == 1) {
                flag = false;
            } else {
                System.out.println("Это не 0 или 1. Введите другое число!");
            }
        }

        numberRand=rand.nextInt(2);

        if (workCycle != 0) {
            return number == numberRand;
        } else {
            return false;
        }
    }

    public String getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(String interpreter) {
        this.interpreter = interpreter;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getWorkCycle() {
        return workCycle;
    }

    public void setWorkCycle(int workCycle) {
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
}
