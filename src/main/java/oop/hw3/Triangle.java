package oop.hw3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;
    private int p;

    public String toString() {
        return a + " " + b + " " + c + " " + p;
    }

    @Override
    public void getArea() {
        int p = (a + b + c) / 2;
        System.out.println("S треугольника = " + (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }

    @Override
    public void getPerimeter() {
        System.out.println("P треугольника = " + (a + b + c));
    }

    public double printArea() {
        System.out.print("Площадь треугольника= ");
        double p = (a + b + c) / 2.0;
        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public double printPerimeter() {
        System.out.print("Периметр треугольника= ");
        return a + b + c;
    }
//    public boolean equals(){
//
//    }



}
