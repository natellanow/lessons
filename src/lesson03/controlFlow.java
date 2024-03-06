package lesson03;

public class controlFlow {
    public static void main(String[] args) {
        // I. IF ... ELSE
        double maxTemperatureValue = 1000;
        double currentTemperatureValue = 200.5;
        if (currentTemperatureValue>maxTemperatureValue) {
            System.out.println("Предупреждение: " +
                    "Превышено максимальное значение");
        }
        // если if true, то то что в фигурных скобках выполняется в принте


        boolean isActive = true;
        if (isActive /* == true - не пишем так, это лишнее */) {}
        if (isActive /* == false - тоже не сравниваем с фолс, а просто спереди пишем "!" */) {}
        // т.е. после if открываются скобки, а после скобок идут фигурные скобки, что значит что должно дальше выполняться действие


        int maxScoreValue = 100;
        int currentScoreValue = 20;
        if (currentScoreValue == maxScoreValue) {
            System.out.println("Вы набрали достаточное" +
                    "количество очков");
        } else {
            // писать именно так
            System.out.println("Вы не успели набрать достаточное"+
                    "количество очков. Попробуйте еще раз");
        }


        char currentChar = "a";
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль-пользователь");
        } else if (currentChar== 'x') {
            // else if промежуточных дополнительных условий может быть сколько угодно
            System.out.println("Ваша роль-администратор");
        } else {
            System.out.println("Вам еще не выдана роль");
        }


        // фигурные скобки можно опустить, если if соответствует одна инструкция
        boolean requestResult = false;
        if (requestResult) System.out.println("Запрос успешно обработан");
        else System.out.println("Обработка запроса завершилась неудачей");

        // так тоже можно
        if (requestResult)
            System.out.println("Запрос успешно обработан");
        else
            System.out.println("Обработка запроса завершилась неудачей");


        // В чём разница?
        currentChar = 'a';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        } else if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }
        // одновременно переменная a принимать несколько значений не может, то
        // лучше сделать как тут - ветвление, а не как внизу, отдельно а и отдельно х



        currentChar = 'a';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        }
        if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }
        // во втором случае два независимых IF


        //  Решите следующую задачу, используя if else:
        //  Даны 3 числа, вывести в консоль наибольшее из них

        public class дз {
            public static void main(String[] args) {
                int a = 10;
                int b = 20;
                int c = 15;
                if (a>b && a>c) {
                    System.out.println("Наибольшее число:" + a);
                } else if (b>c) {
                    System.out.println("Наибольшее число:" + b);
                } else {
                    System.out.println("Наибольшее число:" + c);
                }
            }
        }

/*
В данном примере сравниваются три переменные a, b, c.
Если a больше b и c, то на экран выводится «Наибольшее число: a».
Если это условие не выполняется, то сравниваются b и c. Если b больше c, то на экран выводится «Наибольшее число: b».
Если и это условие не выполняется, то на экран выводится «Наибольшее число: c».
 */
        // Дана переменная currentScoreValue - количество очков,
        // набранное пользователем.
        // если пользователь набрал 90 и более очков, он занял первое место,
        // если пользователь набрал от 80 до 89, он занял второе место,
        // если пользователь набрал меньше 80, он не занял никакого места.
        // Вывести в консоль, какое место занял пользователь.




        // I. SWITCH CASE
        // SWITCH до 21 работает только с int (Integer),
        // byte (Byte),
        // short (Short),
        // char (Character),
        // enum,
        // String
        // выполняется от первого совпадения до первого break


        int monthNumber = 4;
        switch (monthNumber) {
            case 12: // 12 не равен monthNumber
            case 1:  // 1 не равен monthNumber
            case 2:  // 2 не равен monthNumber
                System.out.println("Зима");
                break;
            case 3: // 3 не равен monthNumber
            case 4: // 4 равно monthNumber
            case 5:
                System.out.println("Весна");
                break; // switch завершает работу
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка номера месяца");
        }

        // начиная с java 14 можно использовать новый синтаксис switch
        // называется в стиле лямбда выражений (lambda style) это потому что есть стрелка
        monthNumber = 6;
        switch(monthNumber) {
            // при необходимости выполнить несколько инструкций,
            // используем фигурные скобки
            case 12, 1, 2 -> System.out.println("Зима"); // monthNumber не равен 12, не равен 1, не равен 2
            case 3, 4, 5 -> System.out.println("Весна"); // monthNumber не равен 3, не равен 4, не равен 5
            case 6, 7, 8 -> System.out.println("Лето"); // инструкции выполнятся, monthNumber равен 6, switch завершит работу
            case 9, 10, 11 -> System.out.println("Осень");
            // default -> System.out.println("неверный ввод"); - необязательный блок
        }

        char seasonLetter = switch(monthNumber) {
            case 12, 1, 2 -> 'з'; // monthNumber не равен 12, не равен 1, не равен 2
            case 3, 4, 5 -> 'в'; // monthNumber не равен 3, не равен 4, не равен 5
            case 6, 7, 8 -> 'л'; // инструкции выполнятся, monthNumber равен 6, switch вернёт 'л' и завершит работу
            case 9, 10, 11 -> 'о';
            default -> 'e'; // обязательный блок
        };
        System.out.println(seasonLetter);
        //обратить внимание на ; после }, это потому что идет инициализация char через инструкцию
        // т.е. мы ждем что результат switch будет сохранен в переменную char
        // также обр внимание, что типы данных должны быть одинаковые
        // так как сверху уже есть monthNumber 6, то программа работает с этим числом




        // тут switch возвращает результат своей работы и присваивает его переменной
        seasonLetter = switch(monthNumber) {
            case 12, 1, 2 -> {
                System.out.println("Зима");
                yield 'з'; // т.е. возврат в переменную
            }
            case 3, 4, 5 -> {
                System.out.println("Весна");
                yield 'в';
            }
            case 6, 7, 8 -> {
                System.out.println("Лето");
                yield 'л';
            }
            case 9, 10, 11 -> {
                System.out.println("Осень");
                yield 'о';
            }
            default -> { // обязательный блок
                System.out.println("неверный ввод");
                yield  'e';
            }
        };
        System.out.println(seasonLetter);


        //  Решите следующую задачу, используя switch:
        //  Напишите программу, которая выводит в консоль
        //  количество квартир на выбранном этаже.
        //  1 и 2 этажи - 7 квартир
        //  3 и 4 этажи - 5 квартир
        //  5 этаж - 2 квартиры
        //  Номер этажа хранится в переменной floorNumber.
    }
    int floorNumber = 2;
        switch (floorNumber) {
        case 1:
        case 2:
            System.out.println(7);
            break;
        case 3:
        case 4:
            System.out.println(5);
            break;
        case 5:
            System.out.println(2);
            break;
}

