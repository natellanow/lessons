package lesson05;

import java.util.Arrays;
import java.util.Scanner;/*
Дана строка, содержащая только буквы и цифры. Вывести информацию о том, является ли данная строка палиндромом.
Задача №2 Создать два массива целых чисел на 5 элементов каждый. Массивы необходимо заполнять значениями в цикле.
Значения вводит пользователь с клавиатуры.

Если число отрицательное, добавить его в первый массив.
Если число положительное, добавить его во второй массив.
Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0
Задача №3 Строку, введенную пользователем, приводить к виду: первая заглавная, остальные маленькие.
Пробелов в начале и конце строки быть не должно
 */
public class task {
    public static void main(String[] args) {

        // решение 1
        String string = "tenet";
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        String reversedString = builder.toString();
        if (string.equals(reversedString)) System.out.println("палиндром");
        else System.out.println("не палиндром");

        // решение 2 - описание ошибки ниже
         /* {"данные"} {"данные"} - это два разных объекта
        bulderы сами по себе, обертки
        если мы будем сравнивать bulderы, то мы сравниваем эти оболочки
        данные внутри не учитываются вообще
        если мы хотим сравнивать значения, которые bulderы накопили
        тогда нам нужно эти значения достать через toString
        иначе мы сравниваем обертки - являются это ссылки на один и тот же объект или нет
        больше по bulderам нечего сравнивать
        поэтому toString обязательно у bulderов
         */
        String string00 = "kazak";
        StringBuilder builder00 = new StringBuilder(string00);
        builder00.reverse();
        if (string00.equals(builder00)) System.out.println("палиндром");
        else System.out.println("не палиндром");
    }
}

//задача 2
public static void main(String[] args) {
    int len = 5;
    int[] matrix1 = new int[len];
    int[] matrix2 = new int[len];
    int index1 = 0;
    int index2 = 0;
    Scanner scanner = new Scanner(System.in);
    while (matrix1[matrix1.length - 1] == 0 ||
            matrix2[matrix2.length - 1] == 0) {
        int input = scanner.nextInt();
        if (input == 0) break;
        if (input < 0 && index1 < matrix1.length) {
            matrix1[index1] = input;
            index1++;
        } else if (index2 < matrix2.length) {
            matrix2[index2] = input;
            index2++;
        }
    }
// Задача 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //можно trim сразу добавить в String input = scanner.nextLine().trim();
        String result = input.trim().substring(0,1).toUpperCase()+
                input.trim().substring(1).toLowerCase();
        System.out.println(result);}

    // Задача 4 анаграмма
/*
строки - массивы символов toCharArray()
получить символ строки по индексу charAt(индекс)
в английском алфавите 26 букв
abbyt - ytbab
 */
    public static void main(String[] args){
        String s1 = "abbyt";
        String s2 = "abbty";
        char[] strArr1 = s1.toCharArray();
        char[] strArr2 = s2.toCharArray();
        java.util.Arrays.sort(strArr1);
        java.util.Arrays.sort(strArr2);
        System.out.println(Arrays.equals(strArr1, strArr2));
    }
    /*
    отсортировать массивы char
    берем один массив, второй, оба массива сортируем, получаем отсортированные наборы символов
    после сортировки сравниваем.

     */
     */

    // 2й вариант

    public static void main(String[] args){
        String s1 = "abbyt";
        String s2 = "abbty";
        char[] strArr1 = s1.toCharArray();
        char[] strArr2 = s2.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ints[s1.charAt(i)]++;
            ints[s2.charAt(i)]--;
        }
    }
        /*
        сортировка - только если размеры строк равны
        если они отличаются, то мы вообще ничего не делаем.
        в цикле по размеру любой строки, так как уже выяснили, что строки равны
        в массив складываем счетчики
        берем первый символ первой строчки
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0... (26нулей)]
        это значит что ints[s1.charAt(i)]++   - увеличила индексы на единичку
        а ints[s2.charAt(i)]--    - отработала с этими же элементами и значения уменьшила
        по итогу получится массив который состоит только из нулей
        т.е. будет анаграмма

         */

    // задать массив на n слов
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int lenArr = s.nextInt();
        s.next(); // без этой строчки, enter, после ввода числа, упадет в первый nextLine
        //Если бы переменная была объявлена int lenArr = 8, то это было бы не нужно
        //т.е. после ввода первого пользовательского числа нужна такая строчка, чтобы перейти к другой
        while () {
            String sin = s.nextLine();
            // условия задачи не было в видео, так как оно было выслано в чат
        }
    }

/*
1. Отсортировать массив пузырьковой сортировкой
2. Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
Использовать алгоритм скользящего окна.
 */



/*
Отсортировать массив пузырьковой сортировкой. Задача
 */
    public static void main(String[] args){
        int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44};
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < task02.length-1; i++) {
                if(task02[i]>task02[i+1]) {
                    isSorted = false;

                    buf = task02[i];
                    task02[i] = task02[i+1];
                    task02[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(task02));
    }
/*
Задача
Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
Использовать алгоритм скользящего окна.
решение с использованием дополнительного метода public static int result(int[] nums), но не скользящее окно
 */
        public static void main(String[] args) {
            int[] arr = {88, 34, 12, 55, 90, 4, 10, 44};
            int maxSum = result(arr);
            System.out.println("Максимальная сумма 4 смежных чисел: " + maxSum);
        }
        public static int result(int[] nums) {
            if (nums == null || nums.length < 4)
                throw new IllegalArgumentException("Массив должен содержать как минимум 4 элемента");
            int maxSum = nums[0] + nums[1] + nums[2] + nums[3];
            for (int i = 4; i < nums.length; i++) {
                int currentSum = nums[i - 3] + nums[i - 2] + nums[i - 1] + nums[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            return maxSum;
        }

/*
без дополнительного метода
 */

    public static void main(String[] args) {
        int[] arr = {88, 34, 12, 55, 90, 4, 10, 44};
        if (arr.length < 4) {
            System.out.println("Массив должен содержать как минимум 4 элемента");
            return;
        }
        int maxSum = arr[0] + arr[1] + arr[2] + arr[3];
        for (int i = 4; i < arr.length; i++) {
            int currentSum = arr[i - 3] + arr[i - 2] + arr[i - 1] + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("Максимальная сумма 4 смежных чисел:" + maxSum);
    }

    // скользящее окно

    public class SlidingWindow {
        private SlidingWindow() {
        }

        private static final Logger LOGGER = Logger.getLogger(SlidingWindow.class.getName());
        public static final int NUMBER = 4; //Число элементов массива, для поиска максимума

        public static int slidingWindow(int[] arr) {
            if (arr == null) {
                LOGGER.warning("В метод slidingWindow передан null");
                return 0;
            } else if (arr.length < NUMBER) {
                LOGGER.warning("В метод slidingWindow передан массив с длинной меньше " + NUMBER);
                return 0;
            } else {
                var maxSumma = 0;
                for (int i = 0; i < arr.length; i++) {
                    maxSumma = i < NUMBER ? maxSumma + arr[i] : max(maxSumma, maxSumma - arr[i - NUMBER] + arr[i]);
                }
                String message = "Максимальная сумма четырех чисел: " + maxSumma;
                LOGGER.info(message);
                return maxSumma;
            }
        }
    }
