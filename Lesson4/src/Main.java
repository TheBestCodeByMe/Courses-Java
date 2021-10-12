import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numbOfAmoebas();
        summ(9, 6);
        printTriangle();
        printNumber();
        printmass();
        printmaxel();
        printMass();
        printmassr();
        proverkaMass(new int[]{1, 6, 353, 3, 25});
        proverkaMass(new int[]{1, 6, 353, 25,1});
        kvadrMatr();
    }

    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void numbOfAmoebas() {
        int kol = 0;
        for (int time = 3; time <= 24; time = time + 3) {
            kol = kol + 2;
            System.out.println("The number of amoebas after " + time + " hours is equal to " + kol);
        }
        System.out.println("\n");
    }

//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static void summ(int a, int b) {
        int rez = 0;
        for (int i = 0; i < b; i++) {
            rez = rez + a;
        }
        System.out.println(rez);
        System.out.println("\n");
    }
//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//        00 10 20 *        *               00 01 02 03
//        01 11 *  *        * *             10 11 12 13
//        02 *  *  *        * * *           20 21 22 23
//        *  *  *  *        * * * *         30 31 32 33
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void printTriangle() {
        String[][] mass = new String[4][4];

        for (String[] strings : mass) {
            Arrays.fill(strings, "*"); //идея посоветовала сделать так, пока не совсем поняла, как это работает, но работает)))))
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == 3 || i == 2 && j != 0 || i == 1 && j > 1 || i == 0 && j == 3) {
                    System.out.print(mass[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == 3 || i == 2 && j != 3 || i == 1 && j < 2 || i == 0 && j == 0) {
                    System.out.print(mass[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == 0 || i == 1 && j != 3 || i == 2 && j < 2 || i == 3 && j == 0) {
                    System.out.print(mass[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == 0 || i == 1 && j != 0 || i == 2 && j > 1 || i == 3 && j == 3) {
                    System.out.print(mass[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    //        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void printNumber() {
        Scanner numb = new Scanner(System.in);
        int kol = 0;

        System.out.print("Введите число: ");
        int number = numb.nextInt();

        for (int i = number; i != 0; i /= 10) {
            kol++;
        }

        if (number == 0) {
            System.out.println(number + " - это ноль, количество цифр = " + kol);
        } else if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + kol);
        } else {
            System.out.println(number + " - это отрицательное число, количество цифр = " + kol);
        }
        System.out.println("\n");
    }
//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    public static void printmass() {
        int[] mass = new int[100];

        for (int i = 0, j = 1; i < mass.length && j < 100; i++, j += 2) {
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = 99; i < mass.length && i != -1; i--) {
            if (mass[i] != 0) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println("\n");
    }

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void printmaxel() {
        int[] mass = new int[12];
        Random rand = new Random();
        int rez = 0, number = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(15);
            System.out.print(mass[i] + " ");
        }

        for (int i = 0; i < mass.length; i++) {
            if (rez <= mass[i]) {
                rez = mass[i];
                number = i;
            }
        }
        System.out.println("\n" + ++number + "\n");
    }

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void printMass() {
        int[] mass = new int[20];
        Random rand = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(20);
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < mass.length; i += 2) {
            mass[i] = 0;
        }

        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    //        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void printmassr() {
        //Не поняла с последним 0 или с 1, или вообще оба менять
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int rez = 0, numbermax = 0, number0 = 0, number00 = 0;

        //Реализация, если с последним
        for (int i = 0; i < mass.length; i++) {
            if (rez <= mass[i]) {
                rez = mass[i];
                numbermax = i;
            }
            if (mass[i] == 0) {
                number0 = i;
            }
        }
        mass[number0] = mass[numbermax];
        mass[numbermax] = 0;
        for (int k : mass) {
            System.out.print(k + " ");
        }
        System.out.println();

        //Реализация с первым
        boolean flag = true;
        for (int i = 0; i < mass.length; i++) {
            if (rez <= mass[i]) {
                rez = mass[i];
                numbermax = i;
            }
            if (mass[i] == 0 && flag) {
                number0 = i;
                flag = false;
            }
        }
        mass[number0] = mass[numbermax];
        mass[numbermax] = 0;
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Реализация с первым и последним
        boolean flag1 = true;
        for (int i = 0; i < mass.length; i++) {
            if (rez <= mass[i]) {
                rez = mass[i];
                numbermax = i;
            }
            if (mass[i] == 0) {
                number0 = i;
            }
            if (mass[i] == 0 && flag1) {
                number00 = i;
                flag1 = false;
            }
        }
        mass[number0] = mass[numbermax];
        mass[number00] = mass[numbermax];
        mass[numbermax] = 0;
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    //Не понимаю, как убрать эти 0, чтобы не выводились в массиве
    public static void proverkaMass(int[] mass) {
        int rez;
        boolean flag = true;
        String[] mass1 = new String[mass.length];

        for (int i = 0; i < mass.length; i++) {
            rez = mass[i];
            for (int j = 0; j < mass.length; j++) {
                if(rez==mass[j]&&j!=i){
                    mass1[i]=Integer.toString(mass[j]);
                } else {mass1[i] = "*";}
            }
        }

        for (String s : mass1) {
            if (!s.equals("*")) {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Массив не имеет повторяющих элементов");
        } else {
            System.out.println("Массив имеет повторяющиеся элементы: ");
            for (String s : mass1) {
                if (!s.equals("*")) {
                    System.out.print(s + " ");
                }
            }
        }
        System.out.println();
    }

    //        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    public static void kvadrMatr()
    {
        Scanner vvod = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер матрицы: ");
        int razm1 = vvod.nextInt();
        int razm2 = vvod.nextInt();

        int[][] mass = new int[razm1][razm2];
        int[][] masstransp = new int[razm2][razm1];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(50);
                masstransp[j][i] = mass[i][j];
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int[] ints : masstransp) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}