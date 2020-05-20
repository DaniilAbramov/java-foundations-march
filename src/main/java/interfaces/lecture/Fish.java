package interfaces.lecture;

public class Fish implements Walkable, Swimmable, Runnable {

    @Override
    public void run() {
        System.out.println("Я не бегаю");

    }

    @Override
    public void maxRunDistance() {
        System.out.println("Я не пробегу ни сантиметра");
    }

    @Override
    public void swim() {
        System.out.println("Я люблю плавать");

    }

    @Override
    public void maxSwimSpeed() {
        System.out.println("Я плаваю со скоростью 40");
    }

    @Override
    public void walk() {
        System.out.println("Я гуляю под водой");

    }
}
