package exceptions.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;

//@AllArgsConstructor
@Getter
public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age < 0 || age > 100) {
            throw new MyExceptionHW("Введите корректный возраст");
        }
    }
}
