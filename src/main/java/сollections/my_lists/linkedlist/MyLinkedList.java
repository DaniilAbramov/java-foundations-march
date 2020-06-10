package сollections.my_lists.linkedlist;

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
        Node node = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(get(i))) {
                return true;
            }
            node = node.getNext();
        }
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
        if (size == 0 || o == null) {
            return false;
        }

        if (o.equals(startNode.getElement())) {
            if (startNode.getNext() != null) {
                startNode = startNode.getNext();
            } else {
                startNode = null;
            }
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
        startNode = null;
        size = 0;
    }

    public Object get(int index) {
        Node curNode = startNode;
        for (int i = 0; i < index; i++) {
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
        Node curNode = startNode.getNext();
        Node prevNode = startNode;
        if (index < 0 || index > size) {
            System.err.println("Введите корректный индекс!!");
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            prevNode.setElement(element);
        } else if (index <= size) {
            for (int i = 1; i < index; i++) {
                curNode = curNode.getNext();
                prevNode = prevNode.getNext();
            }
            curNode.setElement(element);
        }
        return false;
    }


    public void add(int index, Object element) {
        Node curNode = startNode.getNext();
        Node prevNode = startNode;
        if (index < 0 || index > size) {
            System.err.println("Введите корректный индекс!!");
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element, null);
        if (index == 0) {
            newNode.setNext(prevNode);
            startNode = newNode;
//                curNode = curNode.getNext();
        } else if (index <= size) {
            for (int i = 1; i < index; i++) {
                curNode = curNode.getNext();
                prevNode = prevNode.getNext();
            }
            newNode.setNext(curNode);
            prevNode.setNext(newNode);
        }
        size++;
    }

    public int indexOf(Object o) {
        Node node = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(get(i))) {
                node = node.getNext();
                return i;
            }
        }
        return -1;
    }

    public Object remove(int index) {
        if (index < 0 || index > size) {
            System.err.println("Введите корректный индекс");
        }
        if (index == 0) {
            if (startNode.getNext() != null) {
                startNode = startNode.getNext();
            } else {
                startNode = null;
            }
            size--;
            return true;
        }

        if (size > 0) {
            Node prevNode = startNode;
            Node curNode = startNode.getNext();
            for (int i = 1; i < size; i++) {
                if (i == index) {
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

    public int lastIndexOf(Object o) {
        Node node = startNode;
        for (int i = size - 1; i >= 0; i--) {
            node = node.getNext();
            if (o.equals(get(i))) {
                return i;
            }
        }
        return 0;
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

//    @Override
//    public String toString() {
//        return "MyLinkedList{" +
//                "startNode=" + startNode +
//                ", size=" + size +
//                '}';
//    }
}
