package strings;

public class WorkWithStrings {
    public static String middleOfLine(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        } else {
            return "Строка содержит нечётное количество символов.";
        }
    }

    public static void middleOfString(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
            } else {
                System.out.println("Строка содержит нечётное количество символов.");
            }
        }
    }
}
