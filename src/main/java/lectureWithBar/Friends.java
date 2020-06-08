package lectureWithBar;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Friends extends Person {
    private String name;
    private String surname;
    private int age;
    private int contact;
    @Override
    public String toString() {
        return name + ": Погнали мужики!!!";
    }
}
