package main.java;

import main.java.strings.WorkWithStrings;
import main.java.work_regular.WorkWithRegular;

public class Main {
    public static void main(String[] args) {
        System.out.println(WorkWithStrings.middleOfLine("казаки"));
        WorkWithRegular.taskTwo("cab,  ccab, cccab");
        WorkWithRegular.taskThree("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");
        WorkWithRegular.taskFour("One two three раз два три one1 two2 123 ");
        System.out.println(WorkWithRegular.taskFive("Привет56"));
        System.out.println(WorkWithRegular.taskFive("привет_56"));
        System.out.println(WorkWithRegular.taskFive("1151515привет"));
        System.out.println(WorkWithRegular.taskFive("scsdcxdfx_5"));
        System.out.println(WorkWithRegular.taskFive("scsdcxdfx6"));
        System.out.println(WorkWithRegular.taskFive("scsdcxdfx5"));
        System.out.println(WorkWithRegular.taskFive("дуе15"));
    }
}
