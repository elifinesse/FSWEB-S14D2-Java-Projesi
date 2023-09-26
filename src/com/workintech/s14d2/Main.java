package com.workintech.s14d2;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(4, PaintColor.PURPLE);

        Bed bed = new Bed("cat tower", 150, 3, 10, 70);

        Lamp lamp = new Lamp(LampType.CEILING_LAMP, false, 60);

        Wardrobe wardrobe = new Wardrobe(2, 2, 70);

        Carpet carpet = new Carpet(2, 3, PaintColor.PINK);

        Bedroom bedroom1 = new Bedroom("kedi odası", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println(bedroom1);

        System.out.println("*****************");

        bed.make();
        lamp.turnOn();
        carpet.lying();
        wardrobe.add();

    }
}