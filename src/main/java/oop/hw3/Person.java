package oop.hw3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private boolean isMale = true;
    private String name;
    private int age;

    public void printAge() {
        if (isMale) {
            System.out.println(age);
        } else {
            System.out.println(age);
        }
    }

    public String toString() {
        return isMale + " " + name + " " + age;
    }
}
