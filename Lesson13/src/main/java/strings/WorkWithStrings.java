package strings;

public class WorkWithStrings {
    public static String middleOfLine(String str) {
        int len = str.length();
        if (len % 2 == 0) {
            return str.substring(len / 2 - 1, len / 2 + 1);
        } else {
            return "Строка содержит нечётное количество символов.";
        }
    }

    public static void middleOfString(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            int len = word.length();
            if (len % 2 == 0) {
                System.out.println(word.substring(len / 2 - 1, len / 2 + 1));
            } else {
                System.out.println("Строка содержит нечётное количество символов.");
            }
        }
    }
}
