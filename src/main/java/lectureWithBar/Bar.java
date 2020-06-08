package lectureWithBar;


public class Bar {
    public static void main(String[] args) {

        Friends tema = new Friends("Tema", "Ivanov", 22, 3);
        Friends dima = new Friends("Dima", "Kozlov", 26, 1);
        Friends andrey = new Friends("Andrey", "Petuhov", 18, 2);
        Friends nikita = new Friends("Nikita", "Kutherov", 30, 3);
        Friends sanya = new Friends("Sanya", "Ivanov", 33, 3);
        Friends vitya = new Friends("Vitya", "Peskov", 21, 1);
        Friends kirill = new Friends("Kirill", "Isaev", 26, 2);
        Woman olga = new Woman("Olga", "Ivanova", 20, 1);
        Woman dasha = new Woman("Dasha", "Petrova", 17, 1);
        Woman luba = new Woman("Luba", "Lubova", 40, 2);
        Woman ira = new Woman("Ira", "Irinova", 21, 3);
        Woman sveta = new Woman("Sveta", "Svetlanova", 23, 2);
        Woman luba1 = new Woman("Luba", "Orlova", 22, 1);
        Woman natasha = new Woman("Natasha", "Koshkina", 17, 3);

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

        chekAge(tusa);
        guestList(tusa);

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
            if (p.getName().equals("Luba")) {

            } else {
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
