package oop.hw3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private boolean isMale = true;
    private String name;
    private int age;

    public void printAge(){
        if (isMale){
            System.out.println(50);
        }else {
            System.out.println(40);
        }
    }
}
