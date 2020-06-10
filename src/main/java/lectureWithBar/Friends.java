package lectureWithBar;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Friends extends Person {
    private final String name;
    private final String surname;
    private int age;
    public String contact;
    @Override
    public String toString() {
        return name + ": Погнали мужики!!!";
    }
}
