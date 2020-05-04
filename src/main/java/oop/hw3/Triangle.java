package oop.hw3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;
    private int p;

    @Override
    public void getArea() {
        int p = (a + b + c) / 2;
        System.out.println("S треугольника = " + (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }

    @Override
    public void getPerimeter() {
        System.out.println("P треугольника = " + (a + b + c));
    }
}
