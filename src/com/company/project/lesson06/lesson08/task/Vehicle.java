package com.company.project.lesson06.lesson08.task;

public class Vehicle {
    /*
    Транспортное средство

1. номер
2. уровень износа
3. максимальная скорость, 120 по-умолчанию
4. метод repair - уменьшает уровень износа на 1, но не ниже 0
            */

    private String carNumber;
    private  int levelOfWare;
    private int maxSpeed = 120;

    public Vehicle() {
    }

    public Vehicle(String carNumber) {
        setCarNumber(carNumber);
        this.carNumber = carNumber;
    }

    public Vehicle(String carNumber, int levelOfWare) {
        setCarNumber(carNumber);
        setLevelOfWare(levelOfWare);
        this.carNumber = carNumber;
        this.levelOfWare = levelOfWare;
    }

    public Vehicle(String carNumber, int levelOfWare, int maxSpeed) {
        setLevelOfWare(levelOfWare);
        setCarNumber(carNumber);
        setMaxSpeed(maxSpeed);
        this.carNumber = carNumber;
        this.levelOfWare = levelOfWare;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getLevelOfWare() {
        return levelOfWare;
    }

    public void setLevelOfWare(int levelOfWare) {
        if (levelOfWare < 0 || levelOfWare > 100)
            throw new IllegalArgumentException("Уровень износа должен быть в пределах от 0 до 100");
        this.levelOfWare = levelOfWare;
    }

    public void setCarNumber(String carNumber) {
        if ("".equals(carNumber)) throw new IllegalArgumentException("Строка не может быть пустой");
        this.carNumber = carNumber;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void repair() {
        if (levelOfWare>0)
            levelOfWare--;
    }

    public final void updateLevelOfWare(int levelOfWare){
        this.levelOfWare -= levelOfWare;
    }
}
