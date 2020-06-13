package lectureWithBar;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Friend extends Person {
    private final String name;
    private final String surname;
    private int age;
    public String contact;

    public Friend(String name, String surname, int age, String contact) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return name + ": Погнали мужики!!!";
    }


}
