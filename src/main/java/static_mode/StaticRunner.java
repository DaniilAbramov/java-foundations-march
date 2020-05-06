package static_mode;

public class StaticRunner {
    public static void main(String[] args) {
        Car ferrari = new Car ("Ferrari");
        Car.setColor("Red");

        System.out.println(ferrari);

        Car lamborgini = new Car("Lamborgini");
        Car.setColor("Yellow");

        System.out.println(lamborgini);

        System.out.println(ferrari);
    }
}
