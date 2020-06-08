package lectureWithBar;

import lombok.Data;

@Data
public class Person implements Comparable {
    private String name;
    private String surname;
    private int age;
    private int contact;


    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
