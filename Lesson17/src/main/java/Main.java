import library.LibraryMain;
import model.Car;

import java.util.*;
import java.util.stream.Collectors;

import static library.util.LibraryUtils.printMap;
import static util.MyUtil.*;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    private static void secondTask() {
        System.out.println(" 2)");
        Set<Integer> set = getSet();
        printCollection(set, true);
        System.out.println("\n" + set.size());
        long count = set.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        System.out.println(count);
    }

    private static void firstTask() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(0, 100));
        }

        System.out.println(list);

        list.stream().map(x -> x * 2).forEach(System.out::println);
    }

    private static void thirdTask() {
        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("arya");
        names.add("sansa");

        System.out.println(names);
        names.stream().map(name -> (name.substring(0, 1).toUpperCase() + name.substring(1))).forEach(System.out::println);
    }

    private static void point3() {
        System.out.println(" 3)");
        List<String> listNames = List.of("john", "arya", "sansa");
        listNames.stream()
//                .map(StringUtils::capitalize)
                .forEach(x -> printWord(x, true));
        System.out.println();
    }


    private static void point4() {
        System.out.println(" 4)");
        List<Car> cars = List.of(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(car -> car.getYear() >= 2010)
                .map(Car::getNumber)
                .filter(Objects::nonNull)
                .filter(x -> !x.equals(""))
                .forEach(System.out::println);
    }


    private static void point5_1() {
        System.out.println(" 5.1)");
        var list = getPersonsList();
        list.stream()
                .filter(person -> person.getLastName().startsWith("Д"))
                .forEach(System.out::println);
    }

    private static void point5_2() {
        System.out.println(" 5.2)");
        var list = getPersonsList();
        Map<String, Long> personsByFirstLetterInLastName = list.stream()
                .collect(Collectors.groupingBy(person -> person.getLastName().substring(0, 1), Collectors.counting()));
        printMap(personsByFirstLetterInLastName);
    }

    private static void point6() {
        LibraryMain libraryMain = new LibraryMain();
        libraryMain.startLibrary();
    }
}
