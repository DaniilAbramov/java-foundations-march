package interfaces.lecture;

public class Bird implements Walkable, Swimmable, Runnable, Flyable {
    @Override
    public void fly() {
        System.out.println("Благодаря крыльям я умею летать");
    }

    @Override
    public void sing() {
        System.out.println("Птичьи песнии");
    }

    @Override
    public void run() {
        System.out.println("я практически не бегаю");

    }

    @Override
    public void maxRunDistance() {
        System.out.println("0");
    }

    @Override
    public void swim() {
        System.out.println("Я практически не плаваю");

    }

    @Override
    public void maxSwimSpeed() {
        System.out.println("Плаваю со скоростью 0");
    }

    @Override
    public void walk() {
        System.out.println("Я гуляю по небу");

    }
}
