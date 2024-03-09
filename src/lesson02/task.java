package lesson02;
/*
1.Объявите переменные для хранения информации об общем количестве писем и о количестве отправленных писем.
Присвойте значения этим переменным. Выведите в консоль, сколько писем осталось отправить.
2.Объявить и инициализировать переменные для хранения времени (в часах) и расстояния (в километрах).
Найти и вывести в консоль скорость, выраженную в метрах в секунду.
3.Найти сумму цифр целого положительного двузначного числа. Результат вывести в консоль.
4.Поменять значения 2х переменных местами, используя арифметические операторы. Результат вывести в консоль.
5.Разобрать, как работает оператор остаток от деления '%'
6.Ответить на вопросы:
Какой тип у doubleResult01 и почему?

Чему равно значение doubleResult01 и почему?

int num01 = 3; int num02 = 2; int result = num01 / num02; var doubleResult01 = (double) (num01 / num02);
 */
public class task {
    //1
    public static void main(String[] args) {
        int letters;
        int lettersSent;
        letters = 46;
        lettersSent = 37;
        System.out.println(letters-lettersSent);
    }

    //2
    public static void main(String[] args) {
        int T = 2;
        int S = 16;
        System.out.println((S/T)/3.6);
    }

    //3
    public static void main(String[] args) {
        var a = "35";
        var b = "49";
        System.out.print(a+b);
    }

    //4
    public static void main(String[] args) {
        int a;
        int b;
        a = 3;
        b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
    }

    //6
    /*
    Какой тип у doubleResult01 и почему?
    Чему равно значение doubleResult01 и почему?
    int num01 = 3; int num02 = 2; int result = num01 / num02; var doubleResult01 = (double) (num01 / num02);
    */
    public static void main(String[] args) {
        int num01 = 3;
        int num02 = 2;
        int result = num01 / num02;
        var doubleResult01 = (double) (num01 / num02);
        System.out.println(doubleResult01);
    }

    // ответ 1
    // было целочисленное деление, а потом приведение к double
