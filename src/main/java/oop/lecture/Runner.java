package oop.lecture;

import oop.hw3.*;

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
        simba.sayMeow();
        Cat niceCat = new Phanter();
        niceCat.sayMeow();

        Person oleg = new Man();
        oleg.setAge(55);
        oleg.setName("Oleg");
        oleg.printAge();
        System.out.println(oleg.getAge());
        System.out.println(oleg.getName());
        System.out.println(oleg.isMale());
        Person fedya = new Man();
        fedya.setName("Fedya");
        fedya.setAge(22);

        Person galya = new Woman();
        galya.printAge();
        galya.setName("Galya");
        galya.setAge(29);
        System.out.println(galya.isMale());

// 3. Создать массив типа Person, добавить туда всех Man и Woman
//// и напечатать их возраст
        Person[] people = new Person[]{galya, oleg, fedya};
        for (Person person : people) {
            person.printAge();
        }
        // Figure

        Figure square = new Square(4);
        square.getArea();
        square.getPerimeter();

        Figure rectangle = new Rectangle(2,4);
        rectangle.getArea();
        rectangle.getPerimeter();

        Figure triangle = new Triangle(2,2,2,0);
        triangle.getArea();
        triangle.getPerimeter();

        System.out.println("galya.toString() = " + galya.toString());
        System.out.println("oleg.toString() = " + oleg.toString());

        System.out.println("square.toString() = " + square.toString());
        System.out.println("rectangle.toString() = " + rectangle.toString());
        System.out.println("triangle.toString() = " + triangle.toString());
    }
}
