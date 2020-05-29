package сollections.my_lists;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");
        myList.add("A8");
        myList.add("A9");
        myList.add("A10");
        myList.add("A11");

        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println(myList.get(10));
        System.out.println(myList.get(10));
        System.out.println(myList.get(-1));
    }
}
