package com.company.project.lesson06.flowers;

public class Flower {
    private int id;
    private String name;
    /*
    public flower() { //если id обязательный параметр, то этого конструктора быть не должно
    }
    */

    public Flower(int id, String name) {
        setId(id); // так вместо 21 и 22 строчки
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0) throw new IllegalArgumentException("id-положительное число"); //здесь можно поставить return, но программа просто закончит работу и ничего не произойдет
        this.id=id;
    }

    public String getName(){
        return name;
    }


    public void setName(String name) {
        this.name=name;
    }
}
