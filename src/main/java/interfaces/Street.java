package interfaces;

public class Street {
    public static void main(String[] args) {
        Walkable dima = new Man();

        Walkable tuzik = new Dog();

        dima.walk();
        tuzik.walk();

        Walkable[] walkables = new Walkable[2];
        walkables[0] = dima;
        walkables[1] = tuzik;

    }

//    public static void printWalkables(Walkable[] walkables) {
//        for (Walkable walkable :walkables) {
//            walkable.walk();
//        }
//    }
}
