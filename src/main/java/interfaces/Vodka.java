package interfaces;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vodka {
    private boolean drink;
    private boolean littleDrink;
    private String vodka;

    void drinkTooMuch() {
        System.out.println("Too much drink");
    }

    void drinkTooMuch(String vodka) {
        System.out.println("Too much drink" + vodka);
    }

    void drinkTooMuch(boolean drink) {
        System.out.println("Too much drink" + drink);
    }

    public Vodka(boolean drink) {

    }

    public Vodka() {
    }

    public Vodka(String vodka) {

    }
    public Vodka(boolean littleDrink,boolean drink, String vodka){

    }

}
