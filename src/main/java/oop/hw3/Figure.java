package oop.hw3;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Figure {
    private int a;
    private int b;
    private int c;

    public void getArea(){
    }
    public void getPerimeter(){

    }

//    public void areaFigure() {
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Введите длину фигуры:");
//        int a = scr.nextInt();
//        System.out.println("Введите ширину:");
//        int b = scr.nextInt();
//        if (a == b) {
//            a = a * a;
//            System.out.println("Площадь вашей вигуры = " + a);
//        } else {
//            a = a * b;
//            System.out.println("Площадь вашей вигуры = " + a);
//        }
//    }

}
