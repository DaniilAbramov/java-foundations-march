package oop.hw2;

public class Customer {
    public static void main(String[] args) {

        Man one = new Man("Аркадий", 23, 183);
        Man two = new Man("Георгий", 37, 180);

        System.out.println("one Name = " + one.getName());
        one.setName("Гриша");
        System.out.println("one new Name = " + one.getName());
        System.out.println("one.getAge() = " + one.getAge());
        one.setAge(25);
        System.out.println("one new Age() = " + one.getAge());
        System.out.println("one.getHeight() = " + one.getHeight());
        one.setHeight(175);
        System.out.println("one new Height() = " + one.getHeight());

        System.out.println("two.getName() = " + two.getName());
        two.setName("Виктор");
        System.out.println("two new Name() = " + two.getName());
        System.out.println("two.getAge() = " + two.getAge());
        two.setAge(40);
        System.out.println("two new Age() = " + two.getAge());
        System.out.println("two.getHeight() = " + two.getHeight());
        two.setHeight(188);
        System.out.println("two new Height() = " + two.getHeight());

    }
}
