package сollections.my_lists.linkedlist;

import сollections.my_lists.arraylist.MyArrayList;

import java.util.Arrays;

public class MyLinkedList {
    private Node startNode;
    private int size = 1;

    public MyLinkedList(Object obj) {
        startNode = new Node(obj, null);
        size = 1;
    }

    public MyLinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(Object o) {

        return false;
    }


    public boolean add(Object o) {
        if (startNode == null) {
            startNode = new Node(o, null);
        } else {
            Node node = startNode;
//1.            for (int i = 0; i < size - 1; i++) {
//                node = node.getNext();
//            }
//            node.setNext(new Node(o, null));
//        }
//2.
//            Node cur;
//        for (cur = startNode; cur.getNext() != null; cur = cur.getNext()) {
//        }
//        cur.setNext(new Node(o, null));
//3.While
            Node cur = startNode;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(new Node(o, null));
        }
        size++;
        return true;
    }

    public boolean remove(Object o) {
        if(size == 0 || o == null){
            return false;
        }

        if (o.equals(startNode.getElement())) {
            if (startNode.getNext() != null) {
                startNode = startNode.getNext();
            } else {
                startNode = null;
            }
            startNode = null;
            size--;
            return true;
        }

        if (size > 1) {
            Node prevNode = startNode;
            Node curNode = startNode.getNext();
            for (int i = 0; i < size - 1; i++) {
                if (o.equals(curNode.getElement())) {
                    prevNode.setNext(curNode.getNext());
                    curNode.setNext(null);
                    size--;
                    return true;
                }
                prevNode = curNode;
                curNode = curNode.getNext();
            }
        }
        return false;
    }


    public void clear() {

    }

    public Object get(int index) {
        Node curNode = startNode;
        for (int i = 0; i < index - 1; i++) {
            curNode = curNode.getNext();
        }
        return curNode.getElement();
    }

    private void checkIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.err.println("Введите корректный индекс от 0 до " + size);
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {

        return false;

    }


    public void add(int index, Object element) {

    }

    public int indexOf(Object o) {

        return -1;
    }

    public Object remove(int index) {

        return true;

    }

    public int lastIndexOf(Object o) {

        return 0;
    }

    public MyArrayList subList(int fromIndex, int toIndex) {

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList{");
        if (startNode != null) {
            Node curNode = startNode;
            for (int i = 0; i < size; i++) {
                sb.append(curNode.getElement()).append(' ');
                curNode = curNode.getNext();
            }
        }
        sb.append('}');

        return sb.toString();
    }
}
