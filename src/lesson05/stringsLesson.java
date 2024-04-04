package lesson05;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class stringsLesson {
    public static void main(String[] args) {
        // char (примитивный тип данных) 16 бит - символ Unicode
        char char01 = 'J'; // сам символ в одинарных кавычках
        // но "J" - строка, ссылочный тип String
        char char02 = 74; // номер символа в таблице Unicode в диапазоне от 0 до 65535
        char char03 = '\u0044'; // 16ричное представление в escape последовательности

        System.out.print(char01);
        System.out.print(char02);
        System.out.print(char03);

        System.out.println('\uD83D');
        System.out.println('\uDC3E');

        System.out.println("\uD83D\uDC3E"); // суррогатная пара

        // каждый символ юникода может быть
        // представлен одним char или парой (суррогатная пара) char

        /*
        если есть возможность создавать строчки просто в двойных кавычках, то
        мы их так и объявляем, если нет возм-ти, то запись через конструктор.
        В двойных кавычках попадают в пул строк и там не дублируются, новые объекты не создаются
        и память не засоряют.
        А если созд строку через new, то в пул она не попадает, хранится рядом и каждый
        вызов new string - это всегда новый объект
         */

        String string01 = "Cat";
        String string02 = "Cat";
        String string03 = new String("Cat");

        // arr.length - это размер массива
        System.out.println(string01.length()); // размер строки

        // Сравнение ссылок
        System.out.println(string01 == string02); // true - ведет к одному и тому же объекту в памяти
        System.out.println(string01 == string03); // false

        // сравнение строк
        string01 = "Строка"; // разные символы т.к. С и с
        string02 = "строка";
        if (string01.equals(string02)) System.out.println("Строки равны"); // метод сравнения с учетом регистра - тут false
        if (string01.equalsIgnoreCase(string02)) System.out.println("Строки равны без учета регистра");


        /*
        если та строка у которой вызывается метод меньше, то метод вернет отрицательное число
         */
        if (string01.compareTo(string02) < 0) { // или compareToIgnoreCase - без учета регистра
            System.out.println(string01 + " меньше " + string02);
        } else if (string01.compareTo(string02) > 0) { // или compareToIgnoreCase - без учета регистра"
            System.out.println(string01 + " больше " + string02);
        } else {
            System.out.println("Строки равны");
        }

        // верхний и нижний регистр
        string01 = " JaVa ";
        string02 = " deVEloPEr ";
        String upperString = string01.toUpperCase();
        String lowerString = string02.toLowerCase();
        System.out.println(upperString);
        System.out.println(lowerString);


        // удаление пробелов с начала и конца строки
        // проверка на последовательность символов в начале и конце строки
        // замена символов
        // string01.startsWith();
        // "str".startsWith();
        // upperString.strip().startsWith()
        // trim U+0020 (U+0020-пробельный символ)
        // " JaVa " toUpperCase " JAVA " strip "JAVA"
        /*
        startsWith("JA") - проверяет начинается ли строка с этого с учетом регистра
        метод replace = что хотим заменить (target "A"), на что replacement. Заменяет все найденные совпадения
        lowerString.repeat - повторение строчки
         */
        if (upperString.strip().startsWith("JA") &&
                lowerString.trim().endsWith("er")) {
            System.out.println(upperString.replace("A", "!") +
                    lowerString.repeat(2));
        }


        // массивы из строк
        string01 = "java junior developer";
        String[] strings = string01.split(" "); // разделитель пробел
        // если будет "" то будет посимвольно- [j,a,v,a, ,j,u,n,i,o,r, ,d,e,v,e,l,o,p,e,r]
        System.out.println(Arrays.toString(strings));
        // получится
        // [java, junior, developer]



        char[] chars = string01.toCharArray();
        System.out.println(Arrays.toString(chars));

        // длина строки
        System.out.println(string01.length());

        // конкатенация строк, приводит к созд новой строчки, объекта
        string01 = "Hello";
        string02 = "World";
        // оператор +
        String concat = string01 + " " + string02;
        concat = "Hello" + " " + "World";
        // метод concat
        concat = string01.concat(" ").concat(string02);

        // StringBuilder или StringBuffer (использовать для конкатенации в цикле)
        // т.е. они не приводят к созданию лишних объектов
        // StringBuilder в самом начале это тип данных
        // строка создается в конце concat = sb.toString()
        // для читабельности '.вызов метода' лучше в столбик
        StringBuilder sb = new StringBuilder();
        sb.append(string01)
                .append(" ")
                .append(string02)
                .append("!!!");
        concat = sb.toString();
        System.out.println(concat);

        String reversed = sb.reverse()
                .delete(0, 3)
                .insert(1, "???")
                .toString();
        System.out.println(reversed);
/*
        [1, 4, 6, 8]
        [[1,5,8], [5,8,9], [1,4,8]]

двумерный массив - элементы массива это другие массивы
т.е. пишем две квадратные скобки string[][], ну или [][][]
уровень вложенности определяется изначально при объявлении переменной и количеством квадратных скобок
если мы инициализируем пустые массивы мы можем сразу указать размерность массива и размерность вложенных массивов
обязаны мы указать только размерность первого массива String[3][3]
размерность вложенных массивов можно не указывать (String[3][])
если мы изначально указываем размерность вложенных массивов, то получаем вот такую структуру -
- [[],[],[]] каждый из этих массивов размером тоже 3
т.к. у нас в примере данные не наполняются значит там будут дефолтные значения
для строк дефолтные значения это null
[[null, null, null], [null, null, null], [null, null, null]]
 */
        String[][] matrix01 = new String[3][3];
        // [[null, null, null], [null, null, null], [null, null, null]]
        String[][] matrix02 = {
                {"open", "close", "process"},
                {"close", "!!close!!", "process", "close"}, // в sout выводим тут второй close
                {"process", "close", "close", "close", "process"}
        };
        System.out.println(matrix02[1][1]); // обращаемся к массиву, к его элементу под индексом 1 и внутри массива выбрали тот который нужен
        System.out.println(Arrays.toString(matrix01));
        /*
        Arrays.toString - распечатает массив, внутри массива тоже массивы и вот их уже он распечатывать не будет
        т.е. это распечатывание с одним уровнем вложенности
        если нужно, чтобы метод заходил внутрь вложенных массивов, то deepToString(matrix01)
         */



        /*
        тут размер не указан String[3][] и поэтому не будет массива с массивами внутри, а просто с nullами
        вместо null мы можем положить массивы со строками
         */
        String[][] animals = new String[3][]; // [null, null, null]
        animals[0] = new String[2]; // [[null, null], null, null] - вместо первого null animals[0] массив из двух строк
        animals[1] = new String[3]; // [[null, null], [null, null, null], null] - во втором null будет массив из трех строк
        animals[2] = new String[4]; // [[null, null], [null, null, null], [null, null, null, null]] - тут из 4х

        // форматирование строк
        String item = "Книга";
        int count = 0;
        double rating = 5.5;
        /*
        Товар: Книга. На складе: 0шт. Рейтинг: 5.5.
        "Товар: + item + ". На складе: " + count + "шт. Рейтинг: " + rating + "."
        "Товар: {item}. На складе: {count}шт. Рейтинг: {rating}." - такого еще не существует
        string bulder будет лучше, чем оператор +
        в фигурные скобки добавляются данные, первые скобки идут с индексом 0, потом 1 и т.д.
        сколько скобок - столько значений и нужно передать - item, count, rating

        */
        String formattedString =
                MessageFormat.format("Товар: {0}. На складе: {1}шт. Рейтинг: {2}.",
                        item, count, rating);
        System.out.println(formattedString);
        // ниже другой вариант вывода строки, идентичный, но функционал больше
        // также стоят индексы, но если введен choice, то есть условие
        MessageFormat messageFormat = new MessageFormat ("Т: {0}." +
                " Кол: {1, choice, 0#товар отсутствует|0<мало|5<много}. Р: {2}.", Locale.UK);
        formattedString = messageFormat.format(new Object[]{item, count, rating});
        System.out.println(formattedString);

        // class MessageFormat
        // {index}
        // {index, type}
        // {index, type, style}
        // number:	integer, currency, percent, custom format - class DecimalFormat
        // date:	short, medium, long, full, custom format - class SimpleDateFormat
        // time:	short, medium, long, full, custom format - class SimpleDateFormat
        // choice:	custom format - class ChoiceFormat

        int number = 1;
        boolean answer = true;
        double value = 5.77233;
        formattedString = String.format("%d) Верный ответ: %B", number, answer);
        // стоят 2 знака % значит два параметра и передаем - number, answer
        System.out.println(formattedString);

        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);

        formattedString = formatter.format("%d) Верный ответ: %B", number, answer).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = formatter.format("%1$d) Верный ответ: %2$b", number, answer).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = String.format("%d) Верный ответ: %B", number, answer);
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = formatter.format("%1$d) Верный ответ: %2$.2f", number, value).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        // %[argument_index$][flags][width][.precision]conversion
        // % и conversion являются обязательными
        // conversion указывает на то, как должен быть отформатирован аргумент:
        // b или B – для логических значений
        // s или S — для строк (String)
        // c или C - для символов
        // d - для десятичного числа
        // o - для восьмеричного числа
        // x или X - для шестнадцатеричного числа
        // f - для чисел с плавающей точкой
        // t или T - дата и время
        // argument_index$ - целое число, аргумент из списка
        // flags - набор символов, используемых для изменения формата вывода.
        // width — положительное целое число, минимальное количество символов, которое должно быть записано в вывод.
        // precision - целое число, используется для ограничения количества символов.
        // Количество цифр после запятой для float и double

    }
}