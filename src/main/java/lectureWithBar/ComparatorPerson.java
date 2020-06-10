package lectureWithBar;

public class ComparatorPerson {

    public int compareTo(Person p1,Person p2) {
        return p1.getContact().compareTo(p2.getContact());
    }
}
