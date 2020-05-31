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
        for (Object value : array) {
            if (o.equals(value)) {
                return true;
            }
        }
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
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) {
                int move = size - i - 1;
                if (move > 0)
                    System.arraycopy(array, i + 1, array, i, move);
                array[--size] = null;
                return true;
            }
        }
        return false;
    }


    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
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
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = element;
            }
            return true;
        }
        return null;
    }


    public void add(int index, Object element) {
//        if (size >= array.length) {
//            Object[] resArray = new Object[3 * 2 * size + 1];
//            System.arraycopy(array, 0, resArray, 0, size);
//            array = resArray;
//            for (int i = 0; i < index; i++) {
//                resArray[i] = array[i];
//            }
//            resArray[index] = element;
//            for (int i = index; i < array.length; i++) {
//                resArray[i + 1] = array[i];
//            }
//        }
//        array[size++] = element;

//        if (size >= array.length) {

        Object[] resArray = new Object[3 * 2 * size + 1];
        System.arraycopy(array, 0, resArray, 0, size);
        array = resArray;
        System.arraycopy(array, index, resArray, index+1, size);
        resArray[index] = element;
//        }


    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public Object remove(int index) {
        array[index] = null;
        int move = size - index - 1;
        if (move > 0)
            System.arraycopy(array, index + 1, array, index, move);
        array[--size] = null;
        return true;

    }

    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return 0;
    }

    public MyArrayList subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        MyArrayList arrayList = new MyArrayList();
        for (int i = fromIndex; i < toIndex; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("MyArrayList{");
//        for (int i = 0; i < size; i++) {
//            sb.append(array[i].toString()).append(' ');
//        }
//        sb.append('}');
//
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
