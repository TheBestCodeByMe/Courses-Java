package main.java.strings;

public class WorkWithStrings {
    public static String middleOfLine(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        } else {
            return "Строка содержит нечётное количество символов.";
        }
    }
}
