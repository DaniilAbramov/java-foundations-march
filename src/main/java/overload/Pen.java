package overload;

public class Pen {
    private String firma;
    private double size;

    // Перегрузка конструкторов
    public Pen() {

    }

    public Pen(String firma) {
        this.firma = firma;
    }

    // Перегрузка методов
    public void print() {
        System.out.println("Pen");
    }

    public void print(String owner, double radius) {
        System.out.println("Pen" + owner + radius);
    }

    public void printPen() {
        System.out.println("Pen");
    }

    public void print(String owner) {
        System.out.println("Pen" + owner);
    }
}
