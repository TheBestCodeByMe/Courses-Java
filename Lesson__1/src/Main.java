import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел:");

        int rez = 0;

        Scanner vvod = new Scanner(System.in);
        String str = vvod.nextLine();
        int[] words = new int[1024];
        String[] w = str.split(" ");

        for(int i = 0; i < w.length ; i++) {
            words[i] = Integer.parseInt(w[i]);

            if(words[i]%2 == 0)
            {
                rez++;
            }
        }

        System.out.println("Количество положительных чисел = " + rez);
    }
}