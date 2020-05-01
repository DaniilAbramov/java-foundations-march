package oop.lecture;

import oop.hw3.Man;
import oop.hw3.Person;
import oop.hw3.Woman;

public class Runner {
    public static void main(String[] args) {
//        Iron vitalikIron = new Iron("Blue");
//        System.out.println(vitalikIron.getColor());
//        vitalikIron.setColor("Red");
//        System.out.println(vitalikIron.getColor());

//        Iron bestIron = new Iron("Black");
        Appliance bestIron = new Iron("Black");
        bestIron.printLocation();
        bestIron.setInShop(false);
        bestIron.printLocation();

//        bestIron.getColor; <-- ошибка, так как ссылка типа Applince

        WashingMachine bosh = new WashingMachine();
//        Appliance bosh = new WashingMachine();
        bosh.printLocation();

        Cat simba = new Lion();
        Cat niceCat = new Phanter();
        niceCat.sayMeow();

        Person oleg = new Man();
        oleg.setAge(55);
        oleg.setName("Oleg");
        oleg.printAge();
        System.out.println(oleg.getAge());
        System.out.println(oleg.getName());
        System.out.println(oleg.isMale());

        Person galya = new Woman();
        galya.printAge();
        galya.setName("Galya");
        System.out.println(galya.isMale());


    }
}
