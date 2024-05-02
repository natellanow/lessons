package com.company.project.lesson06.lesson08.task;

public class Scooter extends Bicycle {
/*Самокат - транспортное средство с доп. свойствами:

1. номер
2. уровень износа
3. максимальная скорость, 120 по-умолчанию
4. количество колес, по-умолчанию, 2
5. тип, по-умолчанию, городской
6. электрический или нет
7. количество колёс самоката всегда равно 2, а тип - "Городской".
8. метод repair - если самокат электрический, уровень износа уменьшается на 2, в противном случае на 3, но не
   меньше 0*/

    private boolean isElectric;

    public Scooter(boolean isElectric) {
        super("городской", 2);
        this.isElectric = isElectric;
    }

    public Scooter(String carNumber, int levelOfWare, int maxSpeed, int numberOfWheels, String type, boolean isElectric) {
        super(carNumber, levelOfWare, maxSpeed, numberOfWheels, type);
        setNumberOfWheels(2);
        setType("городской");
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public void repair(){
        if (isElectric) setLevelOfWare(getLevelOfWare()-2);
        else setLevelOfWare(getLevelOfWare()-3);
    }
}

