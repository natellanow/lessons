package lesson03;
/*
Задача #1 на Math.random() и ветвление
Самостоятельно изучить Math.random() для генерации псевдослучайных чисел.
Написать код, который будет проверять попало ли случайно сгенерированное целое число
из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
Примеры работы программы: Число 345 не содержится в интервале (25;200) Число 110 содержится в интервале (25;200)

Задача #2 на if else
Даны переменные x и y - координаты точки на плоскости.
Необходимо определить четверть координатной плоскости, которой принадлежит данная точка. Результат вывести в консоль.
Если обе координаты положительны, точка принадлежит первой четверти.
Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
Если обе координаты отрицательны, точка принадлежит третьей четверти.
Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.
Задача #3 на switch
Дана переменная monthNumber, которая хранит порядковый номера месяца.
И переменная isLeap, которая хранит информацию о том, является ли год високосным.

Написать программу, которая в зависимости от значения monthNumberвыводит в консоль количество дней в этом месяце.
Необходимо рассмотреть два случая: год не является високосным и год является високосным.

Задача #4 на switch
Даны переменные couponNumber - номер купона и resultSum - сумма покупки.
Если номер купона - 1111, 4444 или 9999 - скидка 10%,
Если номер купона - 3333 или 7777 - скидка 20%,
Если номер купона - 5555 - скидка 30%.
В остальных случаях скидка не предусмотрена.
Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена.
Вывести значение resultSum в консоль.
 */




//Задача #1
/*
Статический метод Math. random() возвращает псевдослучайное число с плавающей запятой,
которое больше или равно нулю и меньше единицы с приблизительно равномерным распределением в этом диапазоне.
В дальнейшем это число можно «отмасштабировать», привести к нужному диапазону
 */
public class task03 {
    public static void main(String[] args) {
        int max = 500;
        int min = 10;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        int minInterval = 25;
        int maxInterval = 200;
        if (rand > minInterval && rand < maxInterval) {
            System.out.println("Число " + rand + " содержится в интервале (25;200)");
        } else if (rand < minInterval || rand > maxInterval) {
            System.out.println("Число " + rand + " не содержится в интервале (25;200)");
        }
    }
}
// Задача #2
public class task03 {
    public static void main(String[] args) {
            int x;
            int y;
            if (x > 0 && y > 0) {
                System.out.println("Точка принадлежит первой четверти");
            } else if (x < 0 && y > 0) {
                System.out.println("точка принадлежит второй четверти");
            } else if (x < 0 && y < 0) {
                System.out.println("Точка принадлежит третьей четверти");
            } else if (x > 0 && y < 0 ) {
                System.out.println("Точка принадлежит четвёртой четверти");
            }
        }
    }

// Задача #3
public class task03 {
    public static void main(String[] args) {
        int monthNumber = 6;
        boolean isLeap = true;
        if (!isLeap) {
            switch (monthNumber) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 день в этом месяце");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 дней в этом месяце");
                    break;
                case 2:
                    System.out.println("28 дней в этом месяце");
                    break;
            }
            if (isLeap) {
                switch (monthNumber) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("31 день в этом месяце");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30 дней в этом месяце");
                        break;
                    case 2:
                        System.out.println("29 дней в этом месяце");
                        break;
                }
            }
        }
    }
}

// Задача #4
public class task03 {
    public static void main(String[] args) {
        int couponNumber = 5555;
        double resultSum = 46830;
        switch (couponNumber) {
            case 1111:
            case 4444:
            case 9999:
                System.out.println(resultSum * 0.9);
                break;
            case 3333:
            case 7777:
                System.out.println(resultSum * 0.8);
                break;
            case 5555:
                System.out.println(resultSum * 0.7);
                break;
            default:
                System.out.println(resultSum);
        }
    }
}

