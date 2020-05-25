package strings.hw;

import java.util.Arrays;


public class TouchStrings {
    public static void main(String[] args) {
        String str = " Я классная строка, поиграйся со мной! ";
        String str2 = "";

        System.out.println("Выведем длину строки = " + str.length());
        System.out.println("Покажем что после запятой: " + str.substring(19));
        System.out.println("Выведем все до запятой: " + str.substring(0, 18));
        System.out.println(false);
        System.out.println("Сравним наши строки = " + false);
        System.out.println("Первая буква строки - " + str.charAt(1));
        System.out.println("Найдем индекс буквы О - " + str.indexOf("о"));
        System.out.println("Все буквы в нижнем регистре - " + str.toLowerCase());
        System.out.println("Все буквы в верхнем регистре - " + str.toUpperCase());
        System.out.println("Сравним строки еще раз - " + str.compareTo(str2));
        System.out.println("Добавим строку в пул строк - " + str.intern());
        System.out.println("Вернем нашу строку - " + str.toString());
        System.out.println("hashCode нашей строки = " + str.hashCode());
        System.out.println("Кол-во уникальных символов в строке - " + str.chars().distinct().count());
        System.out.println("Равны ли по символам наши строки - " + str.contains(str2));
        System.out.println("Сделаем константу" + str.describeConstable());
        System.out.println("getBytes = " + Arrays.toString(str.getBytes()));
        System.out.println("Проверим пустая ли наша строка = " + str.isBlank());
        System.out.println("Проверим пустая ли наша строка = " + str2.isBlank());
        System.out.println("Возвращает тру только если строка 0 - " + str.isEmpty());
        System.out.println("Возвращает тру только если строка 0 - " + str2.isEmpty());
        System.out.println("Соответствует ли первая строка второй - " + str.matches(str2));
        System.out.println("Повторим строку 3 раза - " + str.repeat(3));
        System.out.println("Разделим строку на слова = " + Arrays.toString(str.split(" ", 8)));
        System.out.println("Убираем пробелы по краям строки - " + str.strip());
        System.out.println("Убираем пробелы по краям строки - " + str.trim());



    }
}
