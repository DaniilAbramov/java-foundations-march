package сollections.my_lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);

        System.out.println("myList.get(0) = " + myList.get(0));

        myList.add(0, 2);
        System.out.println("myList.get(0) = " + myList.get(0));

        myList.add(0, 7);
        myList.add(1, -1);

        System.out.print("My list {");
        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println("}");

        printList(myList);
        System.out.println("myList.contains(2) = " + myList.contains(2));

//        for (int i = 0; i <myList.size() ; i++) {
//            if ( i == 2){
//                System.out.println("2 есть в листе");
//                break;
//            }else {
//                System.out.println("2 нет в листе");
//            }
//        }
        if (myList.contains(2)) {
            System.out.println("2 есть в листе");
        } else {
            System.out.println("2 нет в листе");
        }

        myList.remove(0);
        printList(myList);
        myList.remove(Integer.valueOf(2));

        System.out.println("Remove 2");
        printList(myList);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        System.out.println("After adding 3 element");
        printList(myList);

        System.out.println("myList.indexOf(1) = " + myList.indexOf(1));
        System.out.println("myList.lastIndexOf(1) = " + myList.lastIndexOf(1));

        System.out.println("After set ");
        myList.set(1, 5);
        printList(myList);
        System.out.println("After set last element");
        myList.set(myList.size() - 1, 10);
        printList(myList);

//0
        List<String> secondList = new ArrayList<>();
        List<String> thirdList = new ArrayList<>(20);
//1
        thirdList.add(0, "0");
        System.out.println("thirdList.get(0) = " + thirdList.get(0));
        for (int i = 0; i < 19; i++) {
            thirdList.add(String.valueOf(i));
        }
        System.out.println("thirdList.get(thirdList.size()-1) = " + thirdList.get(19));
        System.out.println("Our Array List");
        printList1(thirdList);
    //2

        thirdList.add(0,"1");
        thirdList.add(1,"2");
        thirdList.add(2,"3");
        thirdList.add(3,"4");
        thirdList.add(4,"5");
        printList1(thirdList);
        thirdList.set(2,"0");
        thirdList.set(0,"0");
        printList1(thirdList);

        ArrayList<String> hwList = new ArrayList<>(thirdList);
        printList1(hwList);

    }

    private static void printList(List<Integer> myList) {
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    private static void printList1(List<String> myList) {
        for (String element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


}
