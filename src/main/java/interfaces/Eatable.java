package interfaces;

public interface Eatable {

    default void eat(){
        System.out.println("Поесть");
    }
}
