package com.esubalew;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2000", "Mac", "272", dimensions);

        Monitor theMonitor = new Monitor("27 inch", "acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 5, "Whatever");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();

        // Challenge

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 3, 4, 2, 1);
        Lamp lamp = new Lamp("Classic", true, 75);

        Bedroom bedroom = new Bedroom("Esub's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
