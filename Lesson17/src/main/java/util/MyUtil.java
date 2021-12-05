package util;

import model.Person;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtil {

    private static final Random random = new Random();

    public static List<Integer> getIntegerList(int count, int bound) {
        return Stream.generate(() -> random.nextInt(bound))
                .limit(count)
                .collect(Collectors.toList());
    }

    public static void printCollection(Collection<?> list, boolean inLine) {
        list.forEach(obj -> printWord(obj, inLine));
    }

    public static void printWord(Object word, boolean inLine) {
        String ending = inLine ? " " : "\n";
        System.out.print(word.toString() + ending);
    }

    public static Set<Integer> getSet() {
        return Stream
                .generate(() -> random.nextInt(101))
                .distinct()
                .limit(10)
                .collect(Collectors.toSet());
    }

    public static List<Person> getPersonsList() {
        return List.of(
                new Person("Иван", "Иванов"),
                new Person("Данила", "Данилов"),
                new Person("Александр", "Александров"),
                new Person("Сергей", "Сергеев"),
                new Person("Дмитрий", "Дмитриев"),
                new Person("Андрей", "Андреев"),
                new Person("Антон", "Антонов")
        );
    }

}