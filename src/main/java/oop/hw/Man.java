package oop.hw;

public class Man {
    private String name;
    private int age;
    private int height;

    public Man(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Man() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
