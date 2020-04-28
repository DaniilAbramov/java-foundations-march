package oop.hw2;

public class DishesShop {
    public static void main(String[] args) {

        Cup teeaCup = new Cup("Розовая",250);
        Cup coffeCup = new Cup("Белая",150);

        System.out.println("teeaCup Color = " + teeaCup.getColor());
        teeaCup.setColor("Красная");
        System.out.println("teeaCup new Color = " + teeaCup.getColor());
        System.out.println("teeaCup Volume = " + teeaCup.getVolume());
        teeaCup.setVolume(200);
        System.out.println("teeaCup new Volume = " + teeaCup.getVolume());

        System.out.println("coffeCup Color = " + coffeCup.getColor());
        coffeCup.setColor("Черная");
        System.out.println("coffeCup new Color = " + coffeCup.getColor());
        System.out.println("coffeCup.getVolume = " + coffeCup.getVolume());
        coffeCup.setVolume(100);
        System.out.println("coffeCup new Volume = " + coffeCup.getVolume());

    }
}
