package com.company.project.lesson06.lesson08.task;

public class Main {
    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        Train train = new Train("1", true, 5);
        Bicycle bicycle = new Bicycle("4",2, "городской");
        Scooter scooter = new Scooter("7",24,120,2, "городской", true);

        workshop.addVehicle(train);
        workshop.addVehicle(bicycle);
        workshop.addVehicle(scooter);

        workshop.repairAll();
    }
}
