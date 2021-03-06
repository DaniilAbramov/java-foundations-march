package collections.my_lists.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import сollections.my_lists.linkedlist.MyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedList имеет:")
public class MyLinkedListTest {
    private final MyLinkedList list = new MyLinkedList();

    @Test
    @DisplayName("корректный метод add")
    public void shouldHaveCorrectMethodAdd() {
        String element = "element";
        list.add(element);
        assertEquals("element", String.valueOf(list.get(0)));
    }

    @Test
    @DisplayName("корректный метод add2")
    public void shouldHaveCorrectMethodAdd2() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add(1, "test");
        assertEquals("test", list.get(1));
    }

    @Test
    @DisplayName("кореектный метод size")
    public void shouldHaveCorrectSize() {
        list.add("element");
        assertEquals(1, list.size());
    }

    @Test
    @DisplayName("кореектный метод indexOf")
    public void shouldHaveCorrectIndexOf() {
        list.add("element1");
        list.add("element2");
        assertEquals(0, list.indexOf("element1"));
    }

    @Test
    @DisplayName("кореектный метод indexOf2")
    public void shouldHaveCorrectIndexOf2() {
        list.add("element1");
        list.add("element2");
        assertEquals(1, list.indexOf("element2"));
    }

    @Test
    @DisplayName("кореектный метод Get")
    public void shouldHaveCorrectMethodGet() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals("element3", list.get(2));
    }

    @Test
    @DisplayName("кореектный метод Clear")
    public void shouldHaveCorrectMethodClear() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.size();
        list.clear();
        assertEquals(0, list.size());
        System.out.println(list.size());
    }

    @Test
    @DisplayName("кореектный метод Contains")
    public void shouldHaveCorrectMethodContains() {
        list.add("element1");
        list.add("element2");
        assertEquals(true, list.contains("element2"));
    }

    @Test
    @DisplayName("кореектный метод isEmpty")
    public void shouldHaveCorrectMethodIsEmpty() {
        list.add("element1");
        list.add("element2");
        assertEquals(false, list.isEmpty());

    }

    @Test
    @DisplayName("кореектный метод isEmpty2")
    public void shouldHaveCorrectMethodIsEmpty2() {
        assertEquals(true, list.isEmpty());
    }

    @Test
    @DisplayName("кореектный метод remove(index)")
    public void shouldHaveCorrectMethodRemoveIndex() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals(true, list.remove(2));
        System.out.println("list = " + list);
    }

    @Test
    @DisplayName("кореектный метод remove\"\uD83D\uDE31\"")
    public void shouldHaveCorrectMethodRemove() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals(true, list.remove("element2"));
    }

    @Test
    @DisplayName("кореектный метод Set")
    public void shouldHaveCorrectMethodSet() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals(true, list.set(1, "niceTry"));
        System.out.println(list.get(1));
    }
}
