package lectureWithBar;

import lombok.Data;

@Data
public class Person extends ComparatorPerson {
    private String name;
    private String surname;
    private int age;
    private String contact;


//    @Override
//    public int compareTo(Object o) {
//
//        return 0;
//    }
}
