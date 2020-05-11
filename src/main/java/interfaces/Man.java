package interfaces;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Man implements Walkable, Swimmable, Runnable, Flyable {
    private String sing;
    private int maxRunDistance;
    private double maxSwimSpeed;


    @Override
    public void walk() {
        System.out.println("Я гуляю на двух ногах");
    }

    @Override
    public void fly() {}

    @Override
    public void sing() {
        System.out.println("Lalala");    }

    @Override
    public void run() {
        System.out.println("Я бегаю по утрам");

    }

    @Override
    public void maxRunDistance() {
        System.out.println("Максимум пробегал 50 км");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю в бассейне");

    }

    @Override
    public void maxSwimSpeed() {
        System.out.println("Скорость плаваю со скоростью 6");
    }
}
