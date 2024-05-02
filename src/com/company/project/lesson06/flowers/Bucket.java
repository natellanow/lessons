package com.company.project.lesson06.flowers;

public class Bucket {
    private Flower[] flowers;
    private int index;

    public Bucket(int numberOfFlowers) {
        if (numberOfFlowers <=0) throw new IllegalArgumentException("Размер букета - положительное число");
        this.flowers = new Flower[numberOfFlowers];
    }
//в букет можно добавлять цветы, которые начинаются на а
    //
    public boolean addFlower(Flower flower) {
        if (flower == null) throw new IllegalArgumentException("передайте цветок");
        if (!flower.getName().startsWith("а")
                || !flower.getName().startsWith("А")) return false;
        if (index == flowers.length) return false;
        flowers[index]=flower; //можно так вместо цикла for, если нужно просто добавить, без функционала убрать/добавить
        index++;

        /*
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                flowers[i] = flower;
                return true;
                /*
                если мы не прервем цикл через return, то цикл уйдет на след итерацию и все элементы, все null ссылки
                будут заполнены одним и тем же цветком
                 */
        return true;
            }
        //return false; //если не было null ячеек, то возвращаем false (мест для цветков нет)
    /*
    может быть такая ситуация, что метод addflower вызывается третий раз и там уже есть 3 цветка,
    а массив на 5 элементов, мы не можем перезаписывать,
    т.е. мы не должны 1 цветок выкинуть, а 2й добавить, мы должны добавить цветок на тот элемент,
    т.е. заменить на ту null ссылку, которая есть... не цветок заменить, а именно null ссылку
    [f1, f2, f3, null, null]
    на первой итерации перезаписываем тот цветок, который есть, поэтому прежде, чем добавлять нужно проверить
if (flowers[i]==null) {
        flowers[i] = flower;
    }
    */
 //по индексу добавляем цветок, когда цикл завершит работу - возвращаем true
    //здесь в методе возвращается массив



    public Flower[] getFlowers() {
        return flowers;
    }
    //геттеров на массив быть не должно, написано ниже почему

}
/*
если мы добавим setter, то точно один массив перепишем другим массивом и там могут быть любые цветы
цветы, что были будут удалены сборщиком мусора, а новые цветы с непроверенными данными
окажутся в букете
т.е. setter на массив - плохо, в данном контексте
 */
/*
Flower flower = new Flower(1,"ромашка");
Bucket bucket = new Bucket(3);
bucket.getFlowers()[0] = flower;
        здесь цветок Flower flower = new Flower(1,"ромашка"); - невалидный по нашим критериям
        (цветок не наичнается с а)
        и есть букет
        если бы мы воспользовались методом addFlower, то ромашка не попала бы в букет
        но у букета есть getter
        getter возвращает ссылку на массив, обращаемся к любому допустимому элементу массива [0]
        и передаем туда любое значение
        и таким образом в массив могут попасть любые цветы
        также может попасть null ссылка - bucket.getFlowers()[0] = null;
        getterОВ на массивы быть не должно


        у нас есть массив как внутренне хранилище и доступ к этому массиву закрыт
        private Flower[] flowers;
    private int index;
    на массив нет сеттера, потому что если он будет создан, то неважно как мы добавляли цветы ранее
    в сеттер можно будет передать массив с любыми цветами и вместо существующего массива на 3 цветка например
    у нас окажется массив на 10 цветов у которых названия на а не начинаются, то же самое геттер
    public void setFlowers (Flower[] flowers) {
    this.flowers = flowers;
    }
    у нас есть внутренне хранилище и желательно, чтобы доступ к этому хранилищу был закрыт извне полностью

public Flower getFlowerByIndex(int index) {
     return flowers; } // вернуть цветок по индексу
         */

/*
если будут ограничения, что нельзя добавлять одни и те же цветы в букет (одни и те же объекты в массив)
тогда нужно проверять - не содержится ли там такой элемент, т.е. нужно делать цикл
без цикла нельзя обойтись

 */