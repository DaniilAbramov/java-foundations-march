package oop.hw2;

public class NotebookShop {
    public static void main(String[] args) {

        Notebook hp = new Notebook("HP","AMD","Black");
        Notebook apple = new Notebook("Apple","Intel","White");

        System.out.println("hp Mark = " + hp.getMark());
        hp.setMark("Hewlett-Packard");
        System.out.println("hp full Mark = " + hp.getMark());
        System.out.println("hp.getCpu() = " + hp.getCpu());
        hp.setCpu("Intel");
        System.out.println("hp new Cpu() = " + hp.getCpu());
        System.out.println("hp.getColor() = " + hp.getColor());
        hp.setColor("Grey");
        System.out.println("hp new Color() = " + hp.getColor());

        System.out.println("apple.getMark() = " + apple.getMark());
        apple.setMark("Pear");
        System.out.println("apple new Mark = " + apple.getMark());
        System.out.println("apple.getCpu() = " + apple.getCpu());
        apple.setCpu("AMD");
        System.out.println("apple new Cpu() = " + apple.getCpu());
        System.out.println("apple.getColor() = " + apple.getColor());
        apple.setColor("Black");
        System.out.println("apple new Color() = " + apple.getColor());

    }
}
