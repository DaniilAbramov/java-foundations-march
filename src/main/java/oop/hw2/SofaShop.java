package oop.hw2;

public class SofaShop {
    public static void main(String[] args) {

        Sofa ufo = new Sofa("Leather","Black");
        Sofa uno = new Sofa("Eco-Leather","White");

        System.out.println("ufo.getMaterial() = " + ufo.getMaterial());
        ufo.setMaterial("Cotton");
        System.out.println("ufo new Material() = " + ufo.getMaterial());

        System.out.println("ufo.getColor() = " + ufo.getColor());
        ufo.setColor("Pink");
        System.out.println("ufo new Color() = " + ufo.getColor());

        System.out.println("uno.getMaterial() = " + uno.getMaterial());
        uno.setMaterial("Leather");
        System.out.println("uno new Material() = " + uno.getMaterial());

        System.out.println("uno.getColor() = " + uno.getColor());
        uno.setColor("Grey");
        System.out.println("uno new Color() = " + uno.getColor());
    }
}
