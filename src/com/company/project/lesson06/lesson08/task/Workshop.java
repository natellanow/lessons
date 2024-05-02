package com.company.project.lesson06.lesson08.task;

public class Workshop {
    /*
Класс мастерская:
1. реализовать добавление транспортных средств в массив
2. реализовать метод `repairAll`: вызов метода repair транспортных средств, после ремонта ссылку на транспортное
   средство необходимо обнулять
 */

    private Vehicle[] vehicles;
    private int index;


    public Workshop(int numberOfVehicles){
        if (numberOfVehicles <= 0)
            throw new IllegalArgumentException("Количество не может быть = 0");
        this.vehicles = new Vehicle[numberOfVehicles];
    }

    public Workshop() {
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null)
            throw new IllegalArgumentException("Строка не может быть пустой");
        if (index == vehicles.length) return;
        index++;
    }

    public Vehicle[] getVehicles(){
        return vehicles;
    }

    public void repairAll(){
        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].repair();
            vehicles[i] = null;
        }
    }
}

}
