package com.company.project.lesson06.lesson08;

import lesson05.Arrays;

import java.lang.reflect.Array;

public class TaskApple {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Storage storage = new Storage("Яблочный склад");

        // storage.title = "Склад №1"; //но свойство final и мы не можем присвоить новое значение
        //поэтому свойство доступно только для чтения
        System.out.println(storage.title);
        System.out.println(storage.getTitle());

        // storage.apples = new Apple[100]; - свойство закрыто для записи
        System.out.println(Arrays.toString(storage.apples));
        System.out.println(Arrays.toString(storage.getApples()));
        // то же самое, что и для title - доступно только для чтения
        // если открываем доступ к свойству, то лучше это сделать через getter

        /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        НО! От таких манипуляций final не защищает:
        Перезаписать ссылку нельзя - storage.apples = new Apple[100]
        но обратиться к объекту по ссылке и внутри объекта изменить значение его свойств - можно
        и final от этого никак не защитит.

         */

        storage.apples[0].setColor("yellow");
        storage.apples[1] = apple;

        // storage.apple = new Apple(); //новое яблоко мы положить не можем
        //но обратиться к объекту по ссылке мы можем
        storage.apple.setColor("white");


    }
}
