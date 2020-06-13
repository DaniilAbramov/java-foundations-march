package lectureWithBar;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getContact().compareTo(p2.getContact());
    }
}
