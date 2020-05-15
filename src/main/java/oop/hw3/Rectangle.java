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

    public String toString() {
        return a + " " + b;
    }

    @Override
    public void getArea() {
        System.out.println("S прямоугольника = " + a * b);
    }

    @Override
    public void getPerimeter() {
        System.out.println("P прямоугольника = " + (2 * (a + b)));
    }

    public double printArea() {
        System.out.print("Площадь прямоугольника= ");
        return a * b;
    }

    public double printPerimeter() {
        System.out.print("Периметр прямоугольника= ");
        return (2 * (a + b));
    }
}
