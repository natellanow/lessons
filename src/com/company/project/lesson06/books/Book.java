package com.company.project.lesson06.books;
/*
идентификатор - обязательное свойство
название - обязательное свойство
кол-во страниц -
цена - обязательное свойство
авторы - массив авторов, а не строк, т.е. тип данных Автор, описанный в классе автор, целиком с его данными
если есть обязательные свойства - значит это конструктор,
потому что если свойства задавать необязательно, то значит оно может остаться без какого-то конкретного значения
со значением по умолчанию, а дальше по возможности, либо задается, либо нет

Если мы пишем какой-то класс, значит мы описываем правила создания новых объектов, правила поведения объектов
в мыслях мы можем представить какие есть ограничения у значений - например они не могут быть отрицательными.
Когда объект будет создаваться мы не застрахованы, что будут переданы такие значения:
                 Book book01 = new Book(-1, "", -100) например
все проверки входящих данных ложатся на нас:
                 id > 0; price > 100, title - не пустая строчка
т.е. если значения не валидные, то операции присваивания выполняться не должны

 */
public class Book {
    int id;
    String title;
    int numberOfPages;
    int price;
    Author[] authors;
    public Book(int id, String title, int price) { //конструктор, можно через generate
        if (id > 0) this.id = id;
        if (price>100) this.price = price;
        if (title != null && !title.isEmpty()) this.title = title; // можно еще !title.isEmpty() !title.equals("")

        // if(title != "") так нельзя, потому что строки это ссылочный тип, операторы сравнения с ними не используем
        // т.е. для строк это всегда методы, как и для массивов (arrays.equals например)
        // нужно еще проверить код на ввод null у title, но так: if (!title.isEmpty() && title != null) нельзя
        // потому что программа упадет уже на !title.isEmpty(), поэтому сначала должна быть проверка на null
        // !"".equals(title) метод вернет false, но если так !title.equals(""), то проверка на null обязательна





        }
    }



}