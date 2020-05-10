package interfaces;

public class Dog implements Walkable, Swimmable, Runnable, Flyable {

    @Override
    public void walk() {
        System.out.println("Я гуляю на 4 лапах");
    }

    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }

    @Override
    public void sing() {
        System.out.println("аууу ауууууу аууууууу");
    }

    @Override
    public void run() {
        System.out.println("Я бугаю за машинами");

    }

    @Override
    public void maxRunDistance() {
    }

    @Override
    public void swim() {
        System.out.println("Я люблю купаться");

    }

    @Override
    public void maxSwimSpeed() {
        System.out.println(" Плаваю со скоростью 4");
    }
}
