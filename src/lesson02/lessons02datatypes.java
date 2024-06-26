package lesson02;
// переименовать пакет или класс (папка lesson02 или классdatatypes) - refactor, rename
// однострочный комментарий
/*
многострочный
комментарий
 */

import java.security.spec.RSAOtherPrimeInfo;

/**
 * документирование
 * кода
 */
public class lessons02datatypes {
    public static void main(String[] args) {
        // ctrl+alt+l выравнивание пробелов
        System.out.println("Вывод данных в консоль");
        // объявление переменных
        // типДанных имяПеременной
        int userAge;
        int width, height;
        // инициализация переменной
        userAge = 79;
        width = 100;
        height = 187;

        userAge = 80;
        // если мы обратимся к переменной, которая уже инициализ. и присвоим ей новое значение
        // то это значит что мы присваиваем новое значение или переопределяем значение

        // инициализация в момент объявления
        int numberOfColors = 3;
        int numberOfFruits = 10, numberOfVegetables = 11;
        // можно одного типа переменные, лонически связанные, объявить в рамках одной инструкции

        // все типы данных делятся на примитивные и ссылочные

        // Примитивные
        // 1. целочисленные:
        // 1.1 byte(1 байт -  -128 +127)
        // 1.2 short (2 байта - -327 +32767) практически не исп на практике
        // 1.3 int ( 4байта)
        // 1.4 long (8байт если int недостаточно)

        // 2. числа с плавающей точкой:
        // 2.1 float (4байта) это десятичные, сотые, дробные (это ссылочный тип)
        // 2.2 double (8байт) (ссылочный тип)
        // *** на точность расчетов на типы float и double полагаться нельзя, т.е. для хранения норм, но для вычисления нужны другие типы
        // 3. Логический (boolean)
        // принимает 2 значения true или false для хранения состояний (продано, не продано)
        // 4. символьный тип char (2байта) от 0 до 65535 либо символом в одинарных кавычках

        byte byteFromFile = 56;
        short numberOfLessons = 150;
        long millis = 334, age = 8_000_000_000L;
        // нижнее подчеркивание комп не видит, это просто удобство для разработчика
        // т.к. 8000000000 не входит в диапазон, то указываем L, что это лонг, при инициализации
        float temp = 35.88F; // или 35.88f (F указание что float)
        double maxTemp = 335.88; // буквенных указаний нет

        // объявления через var (java 10) (это когда мы вместо типа данных пишем слово var)
        // через него можно объявлять только локальные переменные методов, т.е. внутри фигурных скобок
        // необходимо инициализ при объявлении
        // для определения типы данных по значению
        var classVersion = 10; // т.е. int
        var bigValue = 10L; // объявление с типом long, иначе, без L - int
        var count = (short) 358;
        var readByte = (byte) 100;
        var balance = 100.5; // double
        var numberOfHours = 15.6F; // float
        var isActive = true; // boolean
        // объявить снова значение с var мы не можем
        isActive = false;

        System.out.println(isActive);
        //нельзя объявить несколько переменных с одинаковым именем в рамках одной области видимости {фиг скобки}


        /*
        если объявляется переменная типа байт, то значение принимает 1 байт памяти
        байтовой переменной можно присовить значение в диапазоне от -128 до 127
        больше или меньше нельзя - будет ошибка
        байты исп-ся для передачи данных по сети, либо для хранения данных в массивах для экономии памяти, если это нужно


         */
        // арифметические операторы
        // +
        // "34" + "45" -> "3445"
        // 1+3 -> 4
        // -
        // 2 - 1 -> 1
        // -3
        // *
        // /
        // 50 / 0 -> ???
        // % остаток от деления (дз)

        int num01 = 10;
        int zeroInt = 0;
        System.out.println(num01/zeroInt);
        //будет ошибка, т.к. на ноль делить нельзя

        double double01 = 10.0;
        double zeroDouble = 0.0;
        // деление числе с плав точкой на 0 - будет infinity
        System.out.println(double01/zeroDouble);

        // результат целочисленного деления - целое число, остаток будет отброшен
        int num01=3;
        int num02=2;
        int result=num01/num02;
        // при необходимости сохранения остатка, один из операндов приводится в double или float
        double doubleResult = (double) num01/num02;

        // var doubleResult01 = (double) (num01/num02);
        // какой тип у doubleResult01? я думаю float или byte
        // чему равно значение? я думаю 1.5




        // результат арифметических операций с byte и short всегда повыщается до int
        // результат вычислений всегда повышается до наибольшего операнта
        // byte - short - int - long - float - double

        // приведение типов:
        // автоматическое
        byte byteValue = 1;
        int intValue = byteValue;
        // явное (тип)
        short shortValue = (short) intValue;

        int sum = 10;
        sum = sum + 10; // т.е. значение именно этой переменной = 20
        sum += 10; // аналогичный процесс что сверху, запись просто другая
        sum-=10;
        sum*=10;
        sum/=10;
        sum%=10; // 0
        // чему = значение sum? - будет 0




    }
}
// в реальности у приложения одна точка входа
/*
psvm - это точка входа
появляется значок play у номера строчки
это запуск приложения
 */
/*
весь исходный код мы помещаем в src, т.е. java файлы
все приложения будут строиться из классов
код вне класса существовать не может
имя класса будет точно таким же как и имя файла в котором он хранится
когда мы нажимаем run, сперва работает компилятор
компилятор проверяет исходный код на наличие ошибок
если ошибки есть, то компилятор сообщает о наличии ошибок и останавливается
если компилятор не находит ошибок, то он компилирует исх код в байт код чтобы этот байт код можно было выполнить
компилятор размещает байткод в файлы с расширением class, т.е.-
- src -> *.java
- работа компилятора
- байткод в файлах *.class
- это расширение появится в папке out
после этого начинает работать интерпритатор
он смотрит в class файлы и выполняет инструкции
 */
/*
если компилятор наткнется на ошибку в исх файлах, то никаких class файлов мы не получим и приложение упадет
если инструкции содержат ошибку приложении падает тоже
т.е. если в исх файлах есть ошибки компиляции, то до момента выполнения программа не дойдет, не соберутся даже class файлы
если в исх коде есть только ошибки времени выполнения, то приложение упадет на моменте его фактического выполнения
и это хуже, так как приложение может дойти до заказчика и упасть например через месяц
т.е. java язык это язык и компилируемый, и интерпритируемый
если бы не среда разработки, то сперва пришлось бы писать java код, потом запускать отдельно компилятор, ждать пока он соберет класс файлы, потом отдельно обращались к интерпритатору для запуска
поэтому среда разработки упрощает систему
 */
/*
JavaDevelopmentKit (JDK) включает:
классы, JavaVirtualMachine(JVM) + интерпритатор, компилятор, отладчик
т.е. свой код пишем на java и используем те классы, которые есть в JDK
они стандартные в зависимости от версии
JVM позволяет запускать приложение
помимо JDK есть еще JavaRuntimeEdition (JRE)
т.е. для разработки - JDK, а для запуска кода можно еще иметь JRE
т.е. например можно открыть class файлы другого разработчика
 */
/*
идея папка это файлы среды для настроек
ресорсес это то что важно для приложения
src это папка с исх кодом
out - скомпилированные, все сгенерированные файлы
все папки можно назвать как угодно, просто среда автоматически их как-то создает

 */
/*
синтаксисом языка мы описываем все инструкции
все инструкции будут разделяться точкой с запятой
 */
/*
например мы в имяПеременной ищем максимальную стоимость, то так и пишем maxprice
т.е. int это тип данных и userAge - имя переменной
далее переменная закончилась и никакой фактической инфы не было
так как стоит ; - т.е. перменная есть, а информации нет
можно также объявить несколько переменных в одну инструкцию, если они одного типа
если нет логики, то отдельно в разные инструкции
 */
/*
инициализация
это когда переменной присваевается значение первый раз
после того как переменная объявлена и если мы обращаемся к ней еще раз, для того чтобы установить значение или чтобы прочитать значение, то тип данных уже не используется
пишется просто имя и то, что мы хотим - либо положить какое-то значение или прочитать
если переменная объявлена с конкретным типом данных (int), то только этот тип данных в переменнуб можно записать
т.е. при int ничего нельзя положить в переменную кроме целых чисел
можно изучить code convention
например по правилам конценции нельзя писать кириллицей, хотя по факту можно
также надо писать имя userAge сперва в нижнем регистре первое слово, а второе - в верхнем
есть и другие требования
знак = это не равенство, это присваивание
т.е. обрашаемся к переменной и кладем данные
 */