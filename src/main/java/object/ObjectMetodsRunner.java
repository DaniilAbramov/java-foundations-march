package object;

import oop.lecture.Cat;

public class ObjectMetodsRunner {
    public static void main(String[] args) {
//        Object obj1 = new Object();
//        Object obj2 = new Object();
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//
//        System.out.println("obj1.equals(obj1) = " + obj1.equals(obj1));
//        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
//
//        System.out.println("obj1.toString() = " + obj1.toString());
//
//        System.out.println("obj1.getClass().getName() = " + obj1.getClass().getName());
//
//        Cat barsik = new Cat();
//        Cat cezar = new Cat();

        Telephone iphoneX = new Telephone("Iphone",10);
        Telephone iphoneXI = new Telephone("Iphone",11);
        Telephone samsungGalaxy = new Telephone("Samsung",3);


        System.out.println(iphoneX.toString());

    }
}
