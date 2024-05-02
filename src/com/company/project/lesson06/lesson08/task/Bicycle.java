package com.company.project.lesson06.lesson08.task;

public class Bicycle extends Vehicle{
    /*Велосипед - транспортное средство с доп. свойствами:

    1. номер
    2. уровень износа
    3. максимальная скорость, 120 по-умолчанию
    4. количество колес, по-умолчанию, 2
    5. тип, по-умолчанию, городской
    6. метод repair - уменьшает уровень износа на 1*/

    private int numberOfWheels = 2;
    private String type = "городской";

    public Bicycle(String type, int numberOfWheels){
    }

    public Bicycle(String carNumber, int numberOfWheels, String type) {
        super(carNumber);
        setNumberOfWheels(numberOfWheels);
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public Bicycle(String carNumber, int levelOfWare, int numberOfWheels, String type) {
        super(carNumber, levelOfWare);
        setNumberOfWheels(numberOfWheels);
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public Bicycle(String carNumber, int levelOfWare, int maxSpeed, int numberOfWheels, String type) {
        super(carNumber, levelOfWare, maxSpeed);
        setNumberOfWheels(numberOfWheels);
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels < 2 || numberOfWheels > 5)
            throw new IllegalArgumentException("Введите адекватное количество колес")
        this.numberOfWheels = numberOfWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if ("".equals(type))
            throw new IllegalArgumentException("Напишите тип, строка пуста")
        this.type = type;
    }

    @Override
    public void repair() {
        super.repair();
    }

}
