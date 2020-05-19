package interfaces.hw2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@AllArgsConstructor
@Getter
@Setter
public class Person implements Comparable<Person>,Cloneable {
    private String name;
    private String surname;
    private int age;


    @Override
    public int compareTo(Person oPerson) {
        if (surname.compareTo(oPerson.surname) < 0) {
            return 1;
        } else if (surname.compareTo(oPerson.surname) > 0) {
            return -1;
        } else if (name.compareTo(oPerson.name) < 0) {
            return 1;
        } else if (name.compareTo(oPerson.name) > 0) {
            return -1;
        } else if (age < oPerson.age) {
            return 1;
        } else if (age>oPerson.age){
            return -1;
        }
            return 0;
    }

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

//    Comparator<Person> = new Comparator<Person>(){}
    public int compare (Person o1,Person o2){
        return o1.surname.compareTo(o2.surname);
    }
}