package collections.my_lists.arraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import сollections.my_lists.arraylist.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList имеет:")
public class MyArrayListTest {
    private final MyArrayList list = new MyArrayList();

    @Test
    @DisplayName("корректный метод add")
    public void shouldHaveCorrectMethodAdd() {
        String element = "element";
        list.add(element);
        assertEquals("element", String.valueOf(list.get(0)));
    }

    @Test
    @DisplayName("корректный метод addIndexAndElement")
    public void shouldHaveCorrectMethodAddIndexAndElement() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add(1, "322");
        assertEquals("322",list.get(1) );
    }

    @Test
    @DisplayName("корректный метод size")
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
    @DisplayName("корректный метод indexOf2")
    public void shouldHaveCorrectIndexOf2() {
        list.add("element1");
        list.add("element2");
        assertEquals(1, list.indexOf("element2"));
    }

    @Test
    @DisplayName("корректный метод Get")
    public void shouldHaveCorrectMethodGet() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals("element3", list.get(2));
    }

    @Test
    @DisplayName("корректный метод Clear")
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
    @DisplayName("корректный метод Contains")
    public void shouldHaveCorrectMethodContains() {
        list.add("element1");
        list.add("element2");
        assertEquals(true, list.contains("element1"));
    }

    @Test
    @DisplayName("корректный метод isEmpty")
    public void shouldHaveCorrectMethodIsEmpty() {
        list.add("element1");
        list.add("element2");
        assertEquals(false, list.isEmpty());

    }

    @Test
    @DisplayName("корректный метод isEmpty2")
    public void shouldHaveCorrectMethodIsEmpty2() {
        assertEquals(true, list.isEmpty());
    }

    @Test
    @DisplayName("корректный метод remove")
    public void shouldHaveCorrectMethodRemove() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals(true, list.remove(1));

    }

    @Test
    @DisplayName("корректный метод remove2\"\uD83D\uDE31\"")
    public void shouldHaveCorrectMethodRemove2() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals(true, list.remove("element2"));
    }

    @Test
    @DisplayName("корректный метод Set")
    public void shouldHaveCorrectMethodSet() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.set(1, "niceTry");
        assertEquals("niceTry", list.get(1));
        System.out.println(list.get(1));
    }
}
