package com.company.project.lesson06.lesson08;
/*
если свойство protected - к нему можно обратиться внутри текущего класса, внутри дочернего класса
(this,healthPoint) и внутри текущего пакета

если в родительском классе нет конструктора без параметров, то в дочернем классе наличие конструктора обязательно
и в этом конструкторе должен быть вызван конструктор родителя
 */
public class Unit {
    // обязательное, можно менять только в методе rest
    protected int healthPoint; // getter
    // должно быть доступно для чтения
    private int speedPoint; // getter

    public Unit(int healthPoint, int speedPoint) {
        this.healthPoint = healthPoint;
        this.speedPoint = speedPoint;
        initialHealthPoint = healthPoint;
    }


    protected int initialHealthPoint;

    public void rest() {
        if (healthPoint>0 && healthPoint < initialHealthPoint){
            healthPoint++;

        }
    }

    public Unit(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
    public int getSpeedPoint() {
        return speedPoint;
    }


    // реализовать метод void rest(): увеличивает healthPoint на 1,
    // 1. если текущее значение 0 или отрицательное число healthPoint не увеличивается
    // 2. healthPoint не может превышать изначального значения
}
