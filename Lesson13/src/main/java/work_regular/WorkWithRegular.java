package main.java.work_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithRegular {
    public static void taskTwo(String str) {
        Pattern pattern = Pattern.compile("c.+?b");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void taskThree(String str) {
        Pattern pattern = Pattern.compile("Java.+?\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void taskFour(String str) {
        // но если использовать сплит, то
        // будет подсчитано количество пробелов между
        // словами с латинскими символами
        // не знаю, правильно это или нет, но выводит правильно
        System.out.println(str.split("[A-a](.+?)|[А-а](.+?)|[\\d]").length);
    }

    public static boolean taskFive(String str) {
        // [a-z](.+?)|[а-я](.+?)|[1](.+?)|[5](.+?)[^\w]
        // [a-zа-я\\b5\\b1]|^[\w] в поиске это работает, тут нет
        // можете дать подсказку, как это лучше соединить?
        Pattern pattern = Pattern.compile("|[a-zа-я](.+?)[15](.+?)^\\w");
        Matcher matcher = pattern.matcher(str);

        return str.length() >= 4 && str.length() < 20 && matcher.find();
    }
}
