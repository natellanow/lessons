package lesson05;

import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
/*
Массив — это непрерывный участок памяти,
содержащий последовательность объектов одинакового типа, обозначаемый одним именем.
Для объявления массива мы сначала указываем тип данных, дальше [], пробел не нужен
Дальше придумываем имя массива
Если речь идет об объявлении с присваиванием, с инициализацией, то пишем оператор new,
потом снова тип данных и в [] указываем размер
 */
        // массив на 5 элементов,
        // заполненный дефолтными значениями
        double[] prices = new double[5]; // пустой массив на 5 элементов*
        // 5 - длина массива
        // [0.0, 0.0, 0.0, 0.0, 0.0]
        // целые числа - 0
        // числа с плавающей точкой - 0.0
        // логический тип - false
        // ссылочные типы - null

        // массив на 6 элементов,
        // заполненный пользовательскими значениями
        int[] temps = {45, 90, 122, 33, -3, 67};
        System.out.println(temps[2]); // 122 - чтение, вывод значения массива
        /*
        т.е. чтобы получить конкретное значение по индексу мы обращаемся к массиву
        ставим [] дальше ставим индекс того элемента, который нам нужен
         */
        prices[1] = 10.6; // [0.0, 10.6, 0.0, 0.0, 0.0] // тут идет замена значения

        /*
        каждый элемент массива находится в нем под индексом
        индексы исп для доступа к элементам
        первый элемент под индексом 0, след под 1 и т.д.
         */

        System.out.println(temps); // запросив вывод массива таким образом мы увидим не массив, а хэшкод объекта
        // import java.util.Arrays;
        System.out.println(Arrays.toString(temps));
        System.out.println(temps.length); // 6

        System.out.println(temps[temps.length-1]);

        // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(temps[10]);

        // fori
        // for
        for (int index = 0; index < prices.length; index++) {
            System.out.println(prices[index]);
            prices[index] += 10;
        }
        // int[] temps = {45, 90, 122, 33, -3, 67};
        // перебрать массив temps, температуры ниже 0
        // заменить на 0,
        // двигаться от последнего элемента к первому

        for (int index = temps.length - 1; index >= 0; index--) {
            if (temps[index] < 0) temps[index] = 0;
        }

        // for (типДанных имяПеременной: массив) {
        //
        // }

        // iter
        for (int temp : temps) {
            System.out.println(temp);
        }
        for (var price : prices) {
            if (price > 100) {
                System.out.println(price);
                break;
            }
        }
        // найти сумму элементов массива temps
        // {45, 90, 122, 33, 0, 67}
        int sum = 0;
        for (int temp : temps) {
            sum += temp;
        }
        System.out.println(sum);

        // Arrays
        int[] ids = {3, 6, 8, 10, 22, 45}; // 100
        System.out.println(Arrays.binarySearch(ids, 8)); // 2
        System.out.println(Arrays.binarySearch(ids, 100)); // -7

        Arrays.sort(temps);
        System.out.println(Arrays.toString(temps));

        String[] colors = {"red", "blue", null, "orange"};

        for (String color : colors) {
            if (color != null) System.out.println(color.toUpperCase());
        }

        int a = 9;
        int b = a;
        // a 90
        // b 10

        // String[] colors = {"red", "blue", null, "orange"};
        // String[] newColors = colors;
        // colors -> {"red", "blue", "null", "green"}
        // newColors -> {"red", "blue", "null", "green"}


        String[] newColors01 = colors.clone();
        String[] newColors02 = Arrays.copyOf(colors, 2);
        // // String[] colors = {"red", "blue", null, "orange"};
        String[] newColors03 = new String[colors.length * 2];
        // [null, "red", "blue", null,"orange", null]
        System.arraycopy(colors, 0, newColors03, 1, 3);

        String[] colors01 = {"red", "blue", "orange"};
        String[] colors02 = {"red", "blue", "orange"};

        System.out.println(colors01 == colors02); // false
        System.out.println(colors01.equals(colors01)); // аналогично ==
        System.out.println(Arrays.equals(colors01, colors02));




    }
}