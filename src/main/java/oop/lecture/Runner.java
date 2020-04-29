package oop.lecture;

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

    }
}
