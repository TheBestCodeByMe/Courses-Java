package work_regular;

import lombok.experimental.UtilityClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class WorkWithRegular {
    public static void taskTwo(String str) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    public static void taskThree(String str) {
        Pattern pattern = Pattern.compile("Java\s+\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    public static void taskFour(String str) {
        // неправильно поняла задание сначала.. Теперь разобралась
        // как оказалось, сама тоже правильно сделала, не успела отправить
        System.out.println(str.split("([а-я]+)|(\\s)|([a-z]*\\d+)").length);
    }

    public static boolean taskFive(String str) {
        Pattern pattern = Pattern.compile("[a-z15]{4,20}");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
