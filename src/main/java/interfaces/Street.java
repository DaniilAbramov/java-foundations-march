package interfaces;

public class Street {
    public static void main(String[] args) {
//        Walkable dima = new Man();
//
//        Walkable tuzik = new Dog();
//
//        dima.walk();
//        tuzik.walk();
//
//        Walkable[] walkables = new Walkable[2];
//        walkables[0] = dima;
//        walkables[1] = tuzik;

        Man oleg = new Man();
        System.out.println("Я человек по имени Олег");
        oleg.walk();
        oleg.run();
        oleg.maxRunDistance();
        oleg.fly();
        oleg.sing();
        oleg.swim();
        oleg.maxSwimSpeed();

        Cat murka = new Cat();
        System.out.println("Я кошка по имени Мурка");
        murka.run();
        murka.maxRunDistance();
        murka.fly();
        murka.sing();
        murka.swim();
        murka.maxSwimSpeed();
        murka.walk();

        Dog bobbik = new Dog();
        System.out.println("Я пес по имени Боббик");
        bobbik.run();
        bobbik.maxRunDistance();
        bobbik.fly();
        bobbik.sing();
        bobbik.swim();
        bobbik.maxSwimSpeed();
        bobbik.walk();

        Fish goldFish = new Fish();
        System.out.println("Я золотая рыбка");
        goldFish.run();
        goldFish.maxRunDistance();
        goldFish.fly();
        goldFish.sing();
        goldFish.swim();
        goldFish.maxSwimSpeed();
        goldFish.walk();

        Bird kesha = new Bird();
        System.out.println("Я птичка по имени Кеша");
        kesha.run();
        kesha.maxRunDistance();
        kesha.fly();
        kesha.sing();
        kesha.swim();
        kesha.maxSwimSpeed();
        kesha.walk();
    }

    public static void printWalkables(Walkable[] walkables) {
        for (Walkable walkable :walkables) {
            walkable.walk();
        }
    }
}
