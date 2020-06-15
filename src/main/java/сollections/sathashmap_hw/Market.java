package сollections.sathashmap_hw;

import java.util.*;

public class Market {
    public static void main(String[] args) {

        Set<Fruit> fruitSet = new HashSet<>();

        Fruit apple = new Fruit("Apple", 1.00);
        Fruit watermelon = new Fruit("Watermelon", 9.00);
        Fruit pear = new Fruit("Pear", 1.00);

        System.out.println(fruitSet.add(apple));
        System.out.println(fruitSet.add(watermelon));
        System.out.println(fruitSet.add(pear));

        for (Fruit fr : fruitSet) {
            System.out.println(fr + " ");
        }
//        System.out.println(fruitSet.remove(watermelon));

//        System.out.println(fruitSet.contains(watermelon));

        Iterator<Fruit> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        Map<Buyer, Fruit> buyerFruitMap = new HashMap<>();

        Buyer ivan = new Buyer("Ivan", 32);
        Buyer andrey = new Buyer("Andrey", 22);
        Buyer grisha = new Buyer("Grisha", 12);
        Buyer tema = new Buyer("Tema", 30);
        Buyer kirya = new Buyer("Kirya", 26);
        Buyer dima = new Buyer("Dima", 24);
        Buyer alex = new Buyer("Alex", 24);
        Buyer mark = new Buyer("Mark", 24);
        Buyer dasha = new Buyer("Dasha", 24);
        Buyer olga = new Buyer("Olga", 24);
        Buyer anton = new Buyer("Anton", 24);
        Buyer danya = new Buyer("Danya", 24);
        Buyer natasha = new Buyer("Natasha", 25);

        Fruit peach = new Fruit("Peach", 0.500);
        Fruit mango = new Fruit("Mango", 1.00);
        Fruit kiwi = new Fruit("Kiwi", 1.00);
        Fruit apricot = new Fruit("Apricot", 0.500);
        Fruit grape = new Fruit("Grape", 2.500);
        Fruit lemon = new Fruit("Lemon", 2.500);
        Fruit strawberry = new Fruit("Strawberry", 1.00);

        System.out.println(fruitSet.add(peach));
        System.out.println(fruitSet.add(mango));
        System.out.println(fruitSet.add(kiwi));
        System.out.println(fruitSet.add(apricot));
        System.out.println(fruitSet.add(grape));

        buyerFruitMap.put(ivan, watermelon);
        buyerFruitMap.put(andrey, pear);
        buyerFruitMap.put(grisha, apple);
        buyerFruitMap.put(tema, apricot);
        buyerFruitMap.put(kirya, kiwi);
        buyerFruitMap.put(dima, watermelon);
        buyerFruitMap.put(alex, watermelon);
        buyerFruitMap.put(mark, watermelon);
        buyerFruitMap.put(dasha, grape);
        buyerFruitMap.put(olga, peach);
        buyerFruitMap.put(anton, mango);
        buyerFruitMap.put(danya, lemon);
        buyerFruitMap.put(natasha, strawberry);

        print(buyerFruitMap);
        System.out.println("Фрукт по ключу: ");
        System.out.println("Ivan " + buyerFruitMap.get(ivan));
        System.out.println("Andrey " + buyerFruitMap.get(andrey));
        System.out.println("Grisha " + buyerFruitMap.get(grisha));

        Map<Buyer, Fruit> buyerFruitMap1 = new HashMap<>(buyerFruitMap);
        System.out.println("Добавили в новый экземпляр мапы, старую мапу - ");
        print(buyerFruitMap1);
//        print(buyerFruitMap);

        System.out.println("Удаляем фрукт");
        Buyer del = null;
        for (Map.Entry<Buyer, Fruit> pair : buyerFruitMap.entrySet()) {
            if (pair.getValue().getName().equals("Grape")) {
                del = pair.getKey();
//                buyerFruitMap.remove(pair.getKey());                     //????
                System.out.println("true");
                break;
            }
        }
        buyerFruitMap.remove(del);
        print(buyerFruitMap);

//        buyerFruitMap.put(ivan, apricot);
//
//        System.out.println(buyerFruitMap.containsKey(ivan));
//
//
//        Set<Buyer> buyers = buyerFruitMap.keySet();
//        System.out.println(buyers + " ");
//        ArrayList<Fruit> fruits =new ArrayList<>(buyerFruitMap.values());
//        System.out.println(fruits + " ");
//
//        print(buyerFruitMap);

        //6
//        for (Buyer pair : buyerFruitMap.keySet()) {
//            if (pair.getName().length() > 5) {
//                System.out.println(pair.getName() + " ");
//            }
//        }

        int count = 0;
//        for (Fruit pair : buyerFruitMap.values()) {
//            if ("Watermelon".equals(pair.getName())) {
//                count++;
//                System.out.println("Колличество этого фрукта: " + count);
//            }
//        }
        //7
//        for (Fruit pair : buyerFruitMap.values()) {
//            if (!"Watermelon".equals(pair.getName())) {
//                System.out.println(pair.getName());
//
//            }else {
//                count++;
//                if(count > 2){
//                    System.out.println(pair.getName());
//                }
//            }
//        }

//        char ch = 'A';
//        System.out.println();
//        System.out.println("Выводим всех кроме первых 2 имя которых на А");
//        for (Map.Entry<Buyer,Fruit> pair : buyerFruitMap.entrySet()){
//            if (pair.getKey().getName().charAt(0) != ch){
//                System.out.println(pair.getKey().getName()+ " "+ pair.getValue());
//            }else {
//                count++;
//                if (count >2){
//                    System.out.println(pair.getKey().getName()+ " " + pair.getValue());
//                }
//            }
//        }

        //8
//        String arb = "WatErMelOn";
//        System.out.println("Возвращаем элемент значение которого arb : ");
//        for (Map.Entry<Buyer,Fruit> pair : buyerFruitMap.entrySet()) {
//            if(pair.getValue().getName().equalsIgnoreCase(arb)){
//                System.out.println(pair.getKey().getName()+ " "+ pair.getValue().getName());
//                break;
//            }
//        }

        //9
        Map<Buyer, Fruit> watermel = new HashMap<>();

        for (Map.Entry<Buyer,Fruit> pair : buyerFruitMap.entrySet()) {
            if (pair.getValue().getName().equals("Watermelon")){
                watermel.put(pair.getKey(),pair.getValue());
            }
        }
        System.out.println("New Map");
        print(watermel);

        //10
//        double average = 0;
//        double summa = 0;
//        for (Fruit pair : buyerFruitMap.values()) {
//            count++;
//            summa += pair.getWeight();
//        }
//        average = summa/count;
//        System.out.println("Средний вес фруктов = " + average);
    }

    private static void print(Map<Buyer, Fruit> buyerFruitMap1) {
        for (Map.Entry<Buyer, Fruit> pair : buyerFruitMap1.entrySet()) {
            System.out.println(pair.getKey().getName() + " " + pair.getValue());
        }
    }
}
