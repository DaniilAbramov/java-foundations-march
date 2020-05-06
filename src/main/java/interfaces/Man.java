package interfaces;

public class Man implements Walkable {

    @Override
    public void walk() {
        System.out.println("Я гуляю на двух ногах");
    }
}
