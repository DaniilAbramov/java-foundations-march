package сollections.my_lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.add("Vitaliy");
        System.out.println("linkedList.toString() = " + linkedList.toString());
        linkedList.add("Maxim");
        linkedList.add("Vitaliy");
        linkedList.add("Olga");
        linkedList.add("Julia");
        System.out.println(linkedList.toString());

//        System.out.println("linkedList.remove(\"Vitaliy\") = " + linkedList.remove("Vitaliy"));
//        System.out.println(linkedList.toString());
        System.out.println("linkedList.remove(\"Maxim\") = " + linkedList.remove("Maxim"));
//        System.out.println("linkedList.contains(\"Maxim\") = " + linkedList.contains("Maxim"));
//        System.out.println(linkedList.toString());
//        System.out.println("linkedList.get() = " + linkedList.get(0));
//        System.out.println("linkedList.indexOf(\"Vitaliy\") = " + linkedList.indexOf("Vitaliy"));
//        System.out.println("linkedList.lastIndexOf(\"Vitaliy\") = " + linkedList.lastIndexOf("Vitaliy"));
        System.out.println(linkedList.toString());
//        linkedList.set(-1,"NewElement");
//        linkedList.add(2,"newName");
//        System.out.println("linkedList.remove(2) = " + linkedList.remove(3));
//        System.out.println(linkedList.toString());
    }
}
