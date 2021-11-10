public class TextFormatter {
    public static int amountWords(String str) {
        return str.split("\\.").length;
    }

    public static boolean hasPalindrom(String str) {
        String[] mass = str.split(" ");
        boolean a = false;
        for (String s : mass) {
            a = s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        }
        return a;
    }
}
