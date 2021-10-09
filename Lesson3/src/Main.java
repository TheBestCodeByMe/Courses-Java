import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(111);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Random rand = new Random();

        System.out.print("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] mass = new int[number];

        System.out.println("\nВывод массива:");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt();
            System.out.println(mass[i]);
        }
        System.out.println("Вывод массива завершен.\n");
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0, то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {

        if (number > 0) {
            return ++number;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }

    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {

        int numb = 0;

        for (int anInt : ints) {
            if (anInt % 2 != 0) {
                numb++;
            }
        }

        return numb;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count % 100 >= 11 && count % 100 <= 19) {
            System.out.println(count + " программистов");
        } else if (count % 10 == 1) {
            System.out.println(count + " программист");
        } else if (count % 10 >= 2 && count % 10 <= 4) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        int[][] mass = new int[10][10];
        int sum = 0;

        Random rand = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt();
                if (i == j) {
                    sum = sum + mass[i][j];
                }
            }
        }

        System.out.println(sum);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        Random rand = new Random();
        Scanner a = new Scanner(System.in);
        int numb1 = a.nextInt();
        int numb2 = a.nextInt();

        int[][] mass = new int[numb1][numb2];
        String[][] mass1 = new String[numb1][numb2];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1.length; j++) {
                if (mass[i][j] % 3 == 0) {
                    mass1[i][j] = "+";
                } else if (mass[i][j] % 7 == 0) {
                    mass1[i][j] = "-";
                } else {
                    mass1[i][j] = "*";
                }
                System.out.print(mass1[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        boolean flag;
        for (int i = 2; i < 1000; i++) {
            flag = true;
            for (int n = 2; n <= i; n++) {
                if (i % n == 0 && i != n) {
                    flag = false;
                } else if (i % n == 0 && i == n && flag) {
                    System.out.println(i);
                }
            }
        }
    }
}
