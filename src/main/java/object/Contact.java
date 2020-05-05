package object;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Contact {
    private String name;
    private int phoneNumber;
    private String work;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (phoneNumber != contact.phoneNumber) return false;
        if (!name.equals(contact.name)) return false;
        return Objects.equals(work, contact.work);
    }

    @Override
    public int hashCode() {
        return phoneNumber;
    }
}
