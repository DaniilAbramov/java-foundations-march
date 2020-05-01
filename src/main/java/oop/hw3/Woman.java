package oop.hw3;

public class Woman extends Person {

    public void printAge(){
        System.out.println("Always 18");
    }

    public Woman (){
        super.setMale(false);
    }
}
