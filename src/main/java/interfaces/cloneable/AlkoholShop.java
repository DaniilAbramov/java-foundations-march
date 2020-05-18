package interfaces.cloneable;

public class AlkoholShop {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle saint = new Bottle(0.5, "plastic", "Saint Spring");
        Bottle shishkinLes = new Bottle(0.7, "plastic", "Shiskin Les");

        Bottle saint2 = (Bottle) saint.clone();

        System.out.println(saint2.toString());
    }
}
