package oop.hw;

public class Cup {
    private String color;
    private int volume;

    public Cup() {
    }

    public Cup(String color, int volume) {
        this.color = color;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}