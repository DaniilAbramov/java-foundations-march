package oop.lecture;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Iron extends Appliance {
    private String color;

    public Iron(String color) {
        System.out.println("Iron");
        this.color = color;
        super.setInShop(false);
    }

//    public Iron(String color) {
//        this.color = color;
//    }

//    public String getColor() {
//        return color;
//    }

//    public void setColor(String color) {
//        this.color = color;
//    }
}
