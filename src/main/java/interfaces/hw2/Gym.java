package interfaces.hw2;

import java.util.Arrays;

public class Gym {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person oleg = new Person("Oleg", "Ivanov", 24);
        Person ivan = new Person("Ivan", "Ivanov", 40);
        Person dasha = new Person("Dasha", "Fortuna", 28);
        Person igor = new Person("Igor", "Petrov", 33);

        Person[] list = new Person[]{oleg, ivan, dasha, igor};

        Arrays.sort(list);
//        for (Person s : list) {
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(list));

        Person cloneOleg = (Person) oleg.clone();
        System.out.println(cloneOleg);

        System.out.println(oleg.compare(dasha, oleg));
    }
}
