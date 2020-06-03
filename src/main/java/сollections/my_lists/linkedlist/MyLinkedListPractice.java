package сollections.my_lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.add("Vitaliy");
        System.out.println("linkedList.toString() = " + linkedList.toString());
        linkedList.add("Maxim");
        System.out.println(linkedList.toString());

        System.out.println("linkedList.remove(\"Vitaliy\") = " + linkedList.remove("Vitaliy"));
        System.out.println(linkedList.toString());
        System.out.println("linkedList.remove(\"Leo\") = " + linkedList.remove("Leo"));
        System.out.println(linkedList.toString());
    }
}
