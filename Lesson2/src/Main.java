public class Main {

        public static void main(String[] args) {
            //Некоторые тесты для проверки задач.
            System.out.println(sum(100, 200));
            System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
            System.out.println(max(56, 349));
            System.out.println(average(new int[]{0, -2, 3, -1, 5}));
            System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
            System.out.println(calculateHypotenuse(3,4));
        }

        /**
         * 1. Метод должен вернуть сумму двух чисел a и b
         * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
         **/
        public static int sum(int a, int b) { // Немного запуталась, не могу понять, почему при сравнении с суммой, оно не ловит ошибку с переполнением
            if(a >= Integer.MAX_VALUE || b >= Integer.MAX_VALUE || a+b >= Integer.MAX_VALUE || a+b <= Integer.MIN_VALUE || a <= Integer.MIN_VALUE || b <= Integer.MIN_VALUE){
                return -1; //
            } else return a+b;
        }

        /**
         *
         * Метод должен вернуть максимальное значение из двух чисел
         *
         * <p>
         * Example1:
         * a = 4,
         * b = 5
         * <p>
         * Метод должен вернуть 5
         * Example2:
         * a = 10,
         * b = 10
         * <p>
         * Метод должен вернуть 10
         */
        public static int max(int a, int b) {
            if(a>b || a==b)
            {
                return a;
            } else return b;
        }

        /**
         * Метод должен вернуть среднее значение из массива чисел
         * (необходимо сумму всех элеменов массива разделить на длину массива)
         * <p>
         * Example:
         * array = {1,2,3,4,5}
         * Метод должен return 3.0
         */
        public static double average(int[] array) {
            return array[array.length/2];
        }

        /**
         * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
         **/
        public static int max(int[] array) {
            int a = array[0];
            int rez = 0;

            for(int i = 1; i < array.length; i++)
            {
                if(a > array[i])
                {
                    rez = a;
                } else a = array[i];

            }
            return rez;
        }

        /**
         * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
         *
         * Example1:
         * 3
         * 4
         * return 5
         * <p>
         * Example2:
         * 12
         * 16
         * return 20
         */
        public static double calculateHypotenuse(int a, int b) {
            return Math.sqrt(Math.pow(a, 2) + Math.pow(b,2)); //
        }

}
