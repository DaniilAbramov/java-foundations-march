package lectureWithBar;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Woman extends Person {
    private final String name;
    private final String surname;
    private int age;
    public String contact;

    public Woman(String name, String surname, int age, String contact) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return name + ": Подожди мне надо накраситься!";
    }
}
