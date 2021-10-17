package com.home.service;

import com.home.model.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String interpreter = "single-chip";
        int ram = 8;
        String hardDrive = "SSD";
        int workCycle = 6;

        Computer comp = new Computer(interpreter, ram, hardDrive, workCycle);

        //System.out.println(comp.toString());


        for (int i = 0; i < workCycle; i++) {
            comp.on();
        }
    }
}
