package oop.hw;

public class Telephone {
    private String mark;
    private int yearRelease;

    public Telephone(String mark, int yearRelease) {
        this.mark = mark;
        this.yearRelease = yearRelease;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

}
