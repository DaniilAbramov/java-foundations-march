package oop.hw3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Square extends Figure {
    private int a;

    public String toString() {
        return a + " ";
    }

    @Override
    public void getArea() {
        System.out.println("S квадрата = " + a * a);
    }

    @Override
    public void getPerimeter() {
        System.out.println("P квадрата = " + (a * 4));
    }
}
