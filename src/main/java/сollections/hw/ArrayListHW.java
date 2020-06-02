package сollections.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListHW {
    public static void main(String[] args) {
        //0
        System.out.println("Задача 0");
        List<String> secondList = new ArrayList<>();
        List<String> thirdList = new ArrayList<>(20);

//1
        System.out.println("Задача 1");
        thirdList.add(0, "0");
        System.out.println("thirdList.get(0) = " + thirdList.get(0));
        for (int i = 0; i < 19; i++) {
            thirdList.add(String.valueOf(i));
        }
        System.out.println("thirdList.get(thirdList.size()-1) = " + thirdList.get(19));
        System.out.println("Our Array List");
        printList1(thirdList);

        //2
        System.out.println("Задача 2");
        thirdList.add(0, "1");
        thirdList.add(1, "2");
        thirdList.add(2, "3");
        thirdList.add(3, "4");
        thirdList.add(4, "5");
        printList1(thirdList);
        thirdList.set(2, "0");
        thirdList.set(0, "0");
        printList1(thirdList);

        ArrayList<String> hwList = new ArrayList<>(thirdList);
        printList1(hwList);

        //3
        System.out.println("Задача 3");
        System.out.println("До удалений " + hwList);
        hwList.remove("0");
        printList1(hwList);

        hwList.remove(7);
        printList1(hwList);

        //4
        System.out.println("Задача 4");
        System.out.println("hwList.contains(\"17\") = " + hwList.contains("17"));

        //5
        System.out.println("Задача 5");
        for (String s : hwList) {
            System.out.print("''" + s + "'';");
        }
        System.out.println();

        //6

        System.out.println("Задача 6");
        printList1(hwList);
        System.out.print("Элементы с индексом делящиеся на 3 - ");
        for (int i = 0; i < hwList.size(); i+=3) {
                System.out.print(hwList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Задача 6.1");
        int count = 0;
        for (String s : hwList) {
            if (s.equals("0")) {
                count++;
            }
        }
        System.out.print("Кол-во 0 в листе = " + count);

        //7
        System.out.println("\nЗадача 7");
        System.out.println("Выводим все элементы кроме первых 3-х = " + hwList.subList(3, hwList.size()));
        hwList.set(20, "0");

        //7.1
        System.out.println("Задача 7.1");
        printList1(hwList);
        int count1 = 0;
        for (String s : hwList) {
            if (s.equals("0")) {
                count1++;
                if (count1 == 2) {
                    System.out.print(s);
                }
            } else {
                System.out.print(s);
            }
        }

        hwList.add("String");
        hwList.add(5, "строка");
        hwList.add(10, "9символов");
        hwList.add(20, "символов");

        //8
        System.out.println("\nЗадача 8");
        printList1(hwList);
        System.out.print("Первый элемент количество символов которого делится на 3 :");
        for (String s : hwList) {
            if (s.length() % 3 == 0) {
                System.out.println(s);
                break;
            }
        }

        //9
        System.out.println("Задача 9");
        printList1(hwList);
        System.out.print("Элементы количество символов которых делится на 3 :");
        for (String s : hwList) {
            if (s.length() % 3 == 0) {
                System.out.print(s + " ");
            }
        }


    }

    private static void printList1(List<String> myList) {
        for (String element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
