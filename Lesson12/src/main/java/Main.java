public class Main {
    public static void main(String[] args) {
        System.out.println(Homework.first("wqcaklbsk"));
        System.out.println(Homework.second("abcdkndincvbd"));
        String[] mass = {"казак", "привет", "заказ", "дед", "имя", "фамилия", "добрый дед"};
        String[] massive = Homework.third(mass);
        for (String value : massive) {
            System.out.println(value);
        }

        String text = "Добрый вечер, вот ваш заказ. Вот ваш заказ. Вы казак. Сделано.";
        if (TextFormatter.amountWords(text) > 0) {
            String[] str = text.split("\\.");
            for (String s : str) {
                if (TextFormatter.hasPalindrom(s) || TextFormatter.amountWords(s) >= 3 && TextFormatter.amountWords(s) < 5) {
                    System.out.println(s);
                }
            }
        }
    }
}
