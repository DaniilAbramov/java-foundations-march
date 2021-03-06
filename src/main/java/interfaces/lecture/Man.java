package interfaces.lecture;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Man implements Walkable, Swimmable, Runnable, Serializable {
    private String sing;
    private int maxRunDistance;
    private double maxSwimSpeed;
    private String name;

    public Man() {

    }


    @Override
    public void walk() {
        System.out.println("Я гуляю на двух ногах");
    }

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
