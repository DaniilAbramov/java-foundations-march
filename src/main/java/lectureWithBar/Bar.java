package lectureWithBar;


import java.util.Arrays;

public class Bar extends ComparatorPerson{
    public static void main(String[] args) {

        Friend tema = new Friend("Tema", "Ivanov", 22, "a");
        Friend dima = new Friend("Dima", "Kozlov", 26, "1");
        Friend andrey = new Friend("Andrey", "Petuhov", 18, "2");
        Friend nikita = new Friend("Nikita", "Kutherov", 30, "3");
        Friend sanya = new Friend("Sanya", "Ivanov", 33, "3");
        Friend vitya = new Friend("Vitya", "Peskov", 21, "1");
        Friend kirill = new Friend("Kirill", "Isaev", 26, "2");
        Woman olga = new Woman("Olga", "Ivanova", 20, "1");
        Woman dasha = new Woman("Dasha", "Petrova", 17, "z");
        Woman luba = new Woman("Luba", "Lubova", 40, "2");
        Woman ira = new Woman("Ira", "Irinova", 21, "3");
        Woman sveta = new Woman("Sveta", "Svetlanova", 23, "2");
        Woman luba1 = new Woman("Luba", "Orlova", 22, "1");
        Woman natasha = new Woman("Natasha", "Koshkina", 17, "3");

        System.out.println(tema.toString());
        System.out.println(dima.toString());
        System.out.println(andrey.toString());
        System.out.println(nikita.toString());
        System.out.println(sanya.toString());
        System.out.println(vitya.toString());
        System.out.println(kirill.toString());

        System.out.println(olga.toString());
        System.out.println(dasha.toString());
        System.out.println(luba.toString());
        System.out.println(sveta.toString());
        System.out.println(luba1.toString());
        System.out.println(ira.toString());
        System.out.println(natasha.toString());

        Person[] tusa = new Person[]{tema, dima, andrey, nikita, sanya, luba, luba1, vitya, kirill, olga, dasha, sveta, ira, natasha};

        ComparatorPerson comparatorPerson = new ComparatorPerson();
        Arrays.sort(tusa,comparatorPerson);
        System.out.println(Arrays.toString(tusa));
//        chekAge(tusa);
//        guestList(tusa);

    }

    private static void chekAge(Person[] tusa) {
        for (Person p : tusa) {
            if ((p.getName().equals("Luba")) || (p.getAge() < 18)) {
                System.out.println(p.getName() + " " + p.getSurname() + " - К сожалению вам нельзя! :( ");
            }
        }
    }

    private static void guestList(Person[] tusa) {
        System.out.print("Итоговый список гостей: ");
        for (Person p : tusa) {
            if (!p.getName().equals("Luba")) {
                System.out.println(p.getName() + " ");
            }
        }
    }

    //    @Override
//    public int compareTo(Object o) {
//        String result = this.
//        return 0;
//    }
//    public int compareTo(Person[] tusa) {
//        for (Person p : tusa) {
//            int result = compareTo(p.getContact());
//        }
//        return 1;
//    }
//}

}
