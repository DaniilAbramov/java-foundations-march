package final_mode;

public class HeadPhones {
    public static final double MINIMUM_VOLUME = 20.0;  // константа

    private String color;
    private final boolean hasBlethooth;
    private String owner;

    public HeadPhones(boolean hasBlethooth, String owner) {
        this.hasBlethooth = hasBlethooth;
        this.owner = owner;
    }
}
