package lesson03;
// урок про операторы сравнения и логические операторы
public class relationalAndLogicalOperators {
    public static void main(String[] args) {
        // операторы сравнения:
        // > больше / >= больше или равно
        // < меньше /
        // == равенство
        // != не равно
        // результат их работы это булевый тип данных true false
        // т.е. сравниваются 2 операнда

        int books = 30, students = 22;
        boolean result = books < students; // будет false
        result = books == students; // false
        result = books != students; // true

        //Логические операторы
        // && и - вернет true, если оба операнда true
        // || или - вернет true, если хотя бы один операнд - true
        // ! не - меняет булевое значение на противоположное

        int maxStudents = 100;
        result = students < maxStudents && students <= books;
        // true сперва, т.е. если students < maxStudents, то оператор идет к следующему операнду - students <= books
        // true И второе
        // если первый операнд false, то второй и не будет проверяться, что очевидно
        // ведь && подразумевает оба true
        // это - students > maxStudents && students <= books - уже неправильно

        result = students > maxStudents || students > books;
        // если первый операнд true, то сразу true, не учитывая следующего
        // если первый false, то переходит ко второму и учитывает второй
        // т.е. хотя бы один должен быть true для true, но в нашем случае оба false

        boolean isActive = true, isStable = false;
        result = !isActive; // станет false с !
        result = !(isActive && isStable); // false
        result = !(students < maxStudents && students <= books); // false
        // используется вместо сравнения с false

        // Тернарный оператор : "?"
        int startYear = 2024, endYear = 2029;
        // возвращает результат в зависимости от условия
        int validationResult = endYear > startYear ? endYear - startYear : -1;
        // задача звучит: если год окончания больше, чем год начала, то мы возвращаем разницу между ними
        // во всех остальных случаях мы хотим получить минус один
        // вообще Тернарный оператор вычисляет какое-то значение и это значение возвращает
        // т.е. если это условие true : endYear > startYear, то после вопроса будет вычисление = 5


        // задача для самостоятельного решения
        int sum = 13500;
        // Если сумма покупки sum больше 1000
        // вернуть сумму покупки с учетом скидки в 10%
        // в противном случае вернуть сумму покупки без учета скидки
        // результат сохранить в переменную и вывести в консоль.
        double sumResult = sum > 1000 ? sum * 0.9 : sum;
        System.out.println(sumResult);


        int a = 23;
        double res = (double) a/2;
        // можно также res = a/2.0, чтобы не ставить double в начале, так как второй операнд уже дабл

        double c = 0.4;
        c = .4; // возможна запись без нуля




    }
}
