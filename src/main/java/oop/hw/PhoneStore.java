package oop.hw;

public class PhoneStore {
    public static void main(String[] args) {

        Telephone apple = new Telephone("Apple",2008);
        Telephone samsung = new Telephone("Samsung",2019);

        System.out.println("apple.getMark() = " + apple.getMark());
        apple.setMark("Samsung");
        System.out.println("apple new Mark() = " + apple.getMark());

        System.out.println("apple.getYearRelease() = " + apple.getYearRelease());
        apple.setYearRelease(2020);
        System.out.println("apple new YearRelease() = " + apple.getYearRelease());

        System.out.println("samsung.getMark() = " + samsung.getMark());
        samsung.setMark("Apple");
        System.out.println("samsung new Mark() = " + samsung.getMark());
        System.out.println("samsung.getYearRelease() = " + samsung.getYearRelease());
        samsung.setYearRelease(2020);
        System.out.println("samsung new YearRelease() = " + samsung.getYearRelease());
    }
}
