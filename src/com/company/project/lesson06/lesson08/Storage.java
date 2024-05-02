package com.company.project.lesson06.lesson08;

public class Storage {
    public final String title;
    public final Apple apple = new Apple(); //свойство apple со значением которое указано
    // можно ли через хранилище поменять у этого яблока цвет? - МОЖНО
    // а что нельзя? - поменять ссылку new Apple()
    // но обратиться по ссылке к этому final объекту мы можем


    public final Apple[] apples = new Apple[10];

    public Storage(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Apple[] getApples() {
        return apples;
    }


    //final с аргументами
    public void addApple(final Apple apple){
        final int a = 90; // final с локальной переменной
        // a = 100; так уже не можем написать из-за final
        System.out.println(a); //доступно только для чтения
        // apple = new Apple(); - нельзя сказать, что аргумент будет ссылаться на другое значение
        // так тоже нельзя - значение, которое пришло в метод мы не используем, а используем новое.
        apple.setColor("green");
    }



}

/*
если свойство отмечено как final, то значение для данного свойства нужно задавать либо при объявлении,
apples = new Apple[10];
либо в конструкторе.
SetterОВ для final свойств быть не может. Только геттеры.
 */