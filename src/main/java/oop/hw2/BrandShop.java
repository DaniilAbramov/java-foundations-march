package oop.hw2;

public class BrandShop {
    public static void main(String[] args) {

        Shop first = new Shop("First","Универсальный");
        Shop second = new Shop("Second","Продуктовый");

        System.out.println("first.getTitle() = " + first.getTitle());
        first.setTitle("Ашан");
        System.out.println("first new Title() = " + first.getTitle());

        System.out.println("first.getProduct() = " + first.getProduct());
        first.setProduct("Продуктовый");
        System.out.println("first new Product() = " + first.getProduct());

        System.out.println("second.getTitle() = " + second.getTitle());
        second.setTitle("Связной");
        System.out.println("second new Title() = " + second.getTitle());

        System.out.println("second.getProduct() = " + second.getProduct());
        second.setProduct("Мобилки");
        System.out.println("second new Product() = " + second.getProduct());

    }
}
