package com.company.project.lesson06.books;

/*
определяемся какую информацию будем хранить об авторе
для автора это будет идентификатор
id имя email
если мы хотим чтобы объекты обладали какими-то характеристиками
например строки обладают характеристиками, у них есть массив с набором byte
и еще у них есть хар-ка это кодировка в которой они хранятся
у наших авторов здесь будут хар-ки это имя и почты
эти хар-ки объектов тоже должны быть описаны в классе
если в классе они не описаны, то у авторов не будет ни имени, ни идентификаторов, т.к. нельзя будет им задать
эти хар-ки называются свойствами и принято их описывать в самом начале после объявления класса
пока делаем их тоже со словом public
свойства или характеристики это по сути переменные которые мы объявляем внутри класса
дальше идет тип данных и имя переменной
и так по каждой характеристике
т.е. теперь у авторов можно задать идентификатор, имя, почту
после созд класса с характеристиками можно начинать созд объекты
напр. тут: String string (класс) = new String() (объект строки)
Scanner scanner (класс) = new Scanner(System.in) (объект сканера)
чтобы создать экземпляр класса или объект, сначала указываем тип данных (переход на lesson06)
 */

/*

 */
public class Author {
    public int id;
    public String name;
    public String email;

    public Author(){
        System.out.println("Default author created");
    }
    public Author(int authorId) {
        id = authorId;
        // это, выше, мы пишем, чтобы значение свойства id того объекта чей конструктор вызывается стало = тому значению которое передается, т.е. 1 в примере
        System.out.println("Author with Id created");
    }
    public Author(String authorEmail) { //тут принимает одну строчку
        email = authorEmail;
        System.out.println("Author with email created");
        }
        public Author(int id, String name, String email){ // тут и число, и две строчки
            this.id = id;
            this.name = name;
            this.email = email;
            System.out.println("Author with email created");
        }
    }
}
/*
public Author(String authorName) {
        name = authorName;
        System.out.println("Author with name created");}

public Author(String authorEmail) {
        email = authorEmail;
        System.out.println("Author with email created");}

несколько конструкторов в одном классе - называется конструктор перегружен
перегруженные конструкторы должны отличаться количеством аргументов, типами данных в скобках
синтаксически запрещено, тут вверху например два string...



Другая ситуация: 3 разных конструктора (тип, порядок, количество)
public Author(int authorId) { //тут принимает 1 целое число
        id = authorId;
        System.out.println("Author with Id created");

public Author(String authorEmail) { //тут принимает одну строчку
        email = authorEmail;
        System.out.println("Author with email created");}

public Author(int id, String name, String email){ // тут и число, и две строчки
        this.id = id;
        this.name = name;
        this.email = email;
        System.out.println("Author with email created");}
//локальная переменная затенила свойство объекта id = id, поэтому пишем this.id = id
//this это ссылка на текущий объект

в классе автор описан функционал создания объектов, у нас есть разные конструкторы, раз функционал есть значит функционалом можно пользоваться
если вызываем конструктор без аргументов, то выполняется инструкция одна единственная default author created и все
т.е. аргумент будет 0, name - null, email - null


используя в коде все три конструктора можно и создавать новые переменные задавая значения в аргумент

Author author02 = new Author(2); //тут только id, остальные null
Author author03 = new Author("Макар"); //тут 0, и почта null
Author author04 = new Author(3, "Саша", "sasha@gmail.com"); //тут все значения



 */


