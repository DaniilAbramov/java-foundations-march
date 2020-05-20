package oop.hw3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Circle extends Figure {
    private int r;

    public String toString() {
        return r + " " + PI + " ";
    }

    public void getArea() {
        System.out.println("Площадь круга= " + (PI * (r * r)));
    }

    public void getPerimeter() {
        System.out.println("Периметр круга= " + (2 * PI * r));
    }
}
