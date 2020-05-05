package object;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Telephone {
    private String type;
    private int modelNumber;

    public String toString() {
        return type + " " + modelNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telephone telephone = (Telephone) o;

        if (modelNumber != telephone.modelNumber) return false;
        return type.equals(telephone.type);
    }

    @Override
    public int hashCode() {
        return modelNumber;
    }
}
