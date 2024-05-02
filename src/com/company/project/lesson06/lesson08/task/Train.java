package com.company.project.lesson06.lesson08.task;

public class Train extends Vehicle {
     /*Поезд - транспортное средство с доп. свойствами:

    1. номер - 1
    2. уровень износа - 1
    3. максимальная скорость, 120 по-умолчанию - 1
    4. количество вагонов
    5. наличие климат-контроля
    6. метод repair - уменьшает уровень износа на 1, - 1
    7. если количество вагонов больше 7, в остальных случаях уменьшает на 2
    */

    private boolean isClimateControl;
    private int amountOfWagons;

    public Train(String carNumber, boolean isClimateControl, int amountOfWagons) {
        super(carNumber);
        setAmountOfWagons(amountOfWagons);
        this.isClimateControl = isClimateControl;
        this.amountOfWagons = amountOfWagons;
    }

    public Train(String carNumber, int levelOfWare, int amountOfWagons, boolean isClimateControl) {
        super(carNumber, levelOfWare);
        setAmountOfWagons(amountOfWagons);
        this.amountOfWagons = amountOfWagons;
        this.isClimateControl = isClimateControl;
    }

    public Train(String carNumber, int levelOfWare, int maxSpeed, int amountOfWagons, boolean isClimateControl) {
        super(carNumber, levelOfWare, maxSpeed);
        setAmountOfWagons(amountOfWagons);
        this.amountOfWagons = amountOfWagons;
        this.isClimateControl = isClimateControl;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }

    public void setClimateControl(boolean climateControl) {
        isClimateControl = climateControl;
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    public void setAmountOfWagons(int amountOfWagons) {
        if (amountOfWagons < 1 || amountOfWagons > 100)
            throw new IllegalArgumentException("Впишите адекватное количество вагонов для поезда");
        this.amountOfWagons = amountOfWagons;
    }

    @Override
    public void repair() {
        if (amountOfWagons > 7) setLevelOfWare(getLevelOfWare()-1);
        else setLevelOfWare(getLevelOfWare()-2);
    }

}

}
