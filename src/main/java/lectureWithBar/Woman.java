package lectureWithBar;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Woman extends Person {
    private String name;
    private String surname;
    private int age;
    public String contact;
    @Override
    public String toString() {
        return name + ": Подожди мне надо накраситься!";
    }
}
