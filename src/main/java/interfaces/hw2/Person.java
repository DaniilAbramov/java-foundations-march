package interfaces.hw2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String surname;
    private int age;

    @Override
    public int compareTo(Person oPerson) {
        if ((surname.compareTo(oPerson.surname) < 0) || (name.compareTo(oPerson.name) < 0) || (age < oPerson.age)) {
            return 1;
        } else if ((surname.compareTo(oPerson.surname) > 0) || (name.compareTo(oPerson.name) > 0) || (age > oPerson.age)) {
            return -1;
        }
        return 0;
    }
//    @Override
//    public int compareTo(Person person) {
//
//        if (surname.compareTo(person.surname) != 0) {
//            return surname.compareTo(person.surname);
//        }
//        if (name.compareTo(person.name) != 0) {
//            return name.compareTo(person.name);
//        }
//        return age - person.age;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}