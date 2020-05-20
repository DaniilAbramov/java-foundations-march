package strings;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Vitaliy";
        String nameCopy = "Vitaliy";
        System.out.println(name == nameCopy);

        String nameConstructor = new String("Vitaliy");

        System.out.println("nameConstructor = " + (name == nameConstructor));

        String interName = nameConstructor.intern();

        System.out.println("name == interName = " + (name == interName));

        String favoriteStr = "I'm favorite string!";

        System.out.println(favoriteStr.substring(4));
        System.out.println(favoriteStr);

        System.out.println(favoriteStr.substring(4, 12));
        System.out.println(favoriteStr.length());

        System.out.println("Begin cycle");
        StringBuilder sb = new StringBuilder(favoriteStr);
        for (int i = 0; i < 100_000_000 ; i++) {
//            favoriteStr = favoriteStr + "!";
            sb.append("!");
        }
        System.out.println("End cycle");
    }
}
