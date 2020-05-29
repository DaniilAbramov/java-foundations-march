package сollections.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.namespace.QName;
import java.util.ArrayList;

@AllArgsConstructor
@Setter
@Getter
public class Person {

    private String name;
    private int age;
    private String gender;

    public static void main(String[] args) {
        Person oleg = new Person("Oleg", 27, "Male");
        Person nikita = new Person("Nilita", 18, "Male");
        Person artem = new Person("Artem", 20, "Male");
        Person nazar = new Person("Nazar", 34, "Male");
        Person narkis = new Person("Narkis", 22, "Male");
        Person olga = new Person("Olga", 18, "Female");
        Person natalya = new Person("Natalya", 22, "Female");
        Person dasha = new Person("Dasha", 10, "Female");
        Person sveta = new Person("Sveta", 33, "Female");

        ArrayList<Person> people = new ArrayList<>();
        people.add(oleg);
        people.add(nikita);
        people.add(artem);
        people.add(nazar);
        people.add(narkis);
        people.add(olga);
        people.add(natalya);
        people.add(dasha);
        people.add(sveta);

        voennoobyazannyi(people);

        averageAgeFemale(people);

    }

    private static void averageAgeFemale(ArrayList<Person> people) {
        int count = 0;
        int ageSum = 0;
        System.out.print("\nСредний вовраст дам в группе = ");
        for (Person p : people) {
            if (p.getGender().equals("Female")) {
                count++;
                ageSum += p.getAge();
            }
        }
        int average = ageSum / count;
        System.out.println(average);
    }

    private static void voennoobyazannyi(ArrayList<Person> people) {
        char n = 'N';
        System.out.print("Военнообязанные - ");
        for (Person p : people) {
            if ((p.getName().charAt(0) == n) && (p.getAge() >= 18 && p.getAge() < 27) && (p.gender.equals("Male"))) {
                System.out.print(p.getName() + ",");
            }
        }
    }


}

