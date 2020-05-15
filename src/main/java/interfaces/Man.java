package interfaces;

public class Man implements Walkable,Talkable,Eatable {

    @Override
    public void walk() {
        System.out.println("Я гуляю на двух ногах");
    }
}
