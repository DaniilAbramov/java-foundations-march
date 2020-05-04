package oop.hw3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Square extends Figure {
    private int a;

    @Override
    public void getArea() {
        System.out.println("S квадрата = " + a * a);
    }

    @Override
    public void getPerimeter() {
        System.out.println("P квадрата = " + (a*4));
    }
}
