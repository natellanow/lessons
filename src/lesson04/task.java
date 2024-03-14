package lesson04;

import java.util.Scanner;

/*
1. Пользователь загадывает число в диапазоне от [1 до 100].
2. Пользователь загадывает в уме, программа не хранит это
   число, а пытается его угадать.
2. Программа пытается его угадать (вместо обычного перебора постарайтесь
3. использовать метод бинарного поиска, т.е
   деление отрезка на 2, пока число не будет найдено).
3. Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
   и, в зависимости от ответа пользователя, принимать решения.
4. Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

Для вывода текста и значения переменной используйте оператор сложения,
например `System.out.println("Число равно " + number);`

a = 1;
b = 100;
mid = (100 + 1) / 2

 */
public class task {
    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        int rightNumber = 101;
        int leftNumber = 0;
        int programNumber = 50;
        System.out.println("Придумайте целое число от 1 до 100");
        while (rightNumber != leftNumber + 2) {
            System.out.println("Число равно " + programNumber + "?\n1 - Да\n0 - Нет");
            userInput = scanner.nextInt();
            if (userInput == 0) {
                System.out.println("Число больше, чем " + programNumber + "?\n1 - Да\n0 - Нет");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    leftNumber = programNumber;
                    programNumber += (rightNumber - leftNumber) / 2;
                } else if (userInput == 0) {
                    rightNumber = programNumber;
                    programNumber -= (rightNumber - leftNumber) / 2;
                } else {
                    System.out.println("Неверная подсказка");
                }
            } else if (userInput == 1) {
                break;
            } else {
                System.out.println("Неверная подсказка");
            }
        }
        System.out.println(programNumber);
    }
}

