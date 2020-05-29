package сollections.my_lists;


import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    private Object[] array;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
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
        if (size >= array.length) {
            Object[] resArray = new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, size);
            array = resArray;
        }
        array[size++] = o;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }


    public void clear() {

    }


    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    private void checkIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.err.println("Введите корректный индекс от 0 до " + size);
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


    public Object remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public MyArrayList subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        MyArrayList arrayList = new MyArrayList();
        for (int i = fromIndex; i <toIndex ; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList{");
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append(' ');
        }
        sb.append('}');

        return sb.toString();
    }
}
