import java.util.*;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    private static void secondTask() {
        // не успела сделать
        Set<Integer> integerSet = new HashSet<>();
//        for (int i = 0; integerSet.size() != 50; i++) {
//            integerSet.add(random.nextInt(0, 101));
//        }
//        integerSet.stream().flatMap(x->range(0, 101)).distinct().collect();
        System.out.println(integerSet);
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
}
