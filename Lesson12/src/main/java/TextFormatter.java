public class TextFormatter {
    public static int amountWords(String str) {
        return str.split("\\.").length;
    }

    public static boolean hasPalindrom(String str) {
        String[] mass = str.split(" ");
        boolean a = false;
        for (String s : mass) {
            a = isPalindrom(s);
        }
        return a;
    }

    private static boolean isPalindrom(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
