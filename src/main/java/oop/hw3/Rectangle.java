package oop.hw3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
public class Rectangle extends Figure {
    private int a;
    private int b;

    @Override
    public void getArea() {
        a = 5;
        b = 4;
        System.out.println("S прямоугольника = " + a * b);
    }

    @Override
    public void getPerimeter() {
        a = 5;
        b = 4;
        System.out.println("P прямоугольника = " + (2 * (a + b)));
    }
}
