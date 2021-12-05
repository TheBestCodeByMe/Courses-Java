public class Homework {
    public static String first(String str) {
        return str.substring(str.toUpperCase().indexOf('A'), (str.toUpperCase().lastIndexOf('B') + 1));
    }

    public static String second(String str) {
        return str.replace(str.charAt(3), str.charAt(0));
    }

    public static String[] third(String[] mass) {
        String[] result = new String[mass.length];
        int j = 0;
        for (String s : mass) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                result[j] = s;
                j++;
            }
        }

        return result;
    }
}
