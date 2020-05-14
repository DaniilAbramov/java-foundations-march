package interfaces;

public class Cat implements Walkable, Swimmable, Runnable {

    @Override
    public void run() {
        System.out.println("Я бегаю когда охочусь");

    }

    @Override
    public void maxRunDistance() {
        System.out.println("Максимум пробегу 20 км");
    }

    @Override
    public void swim() {
        System.out.println("Я не люблю купаться");

    }

    @Override
    public void maxSwimSpeed() {
        System.out.println("Я плавая со скоростью 4");
    }

    @Override
    public void walk() {
        System.out.println("Я больше люблю полежать");

    }
}
