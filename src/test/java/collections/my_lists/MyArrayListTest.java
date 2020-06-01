package collections.my_lists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import сollections.my_lists.MyArrayList;

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

    }@Test
    @DisplayName("кореектный метод indexOf2")
    public void shouldHaveCorrectIndexOf2() {
        list.add("element1");
        list.add("element2");
        assertEquals(1, list.indexOf("element2"));
    }

}
