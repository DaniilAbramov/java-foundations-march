package oop.hw3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Square extends Figure {
    private int a;

    public Square(){}
    @Override
    public void getArea() {
        a = 5;
        System.out.println("S квадрата = " + a * a);
    }

    @Override
    public void getPerimeter() {
        a = 5;
        System.out.println("P квадрата = " + (a * 4));
    }
}
