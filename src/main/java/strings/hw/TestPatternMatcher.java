package strings.hw;

import java.util.Scanner;

public class TestPatternMatcher {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите номер телефона :");
        String input = scr.nextLine();
        boolean result = input.matches("(\\+*)\\d{11}");
        if (result) {
            System.out.println("Это номер телефона");
        }else {
            System.out.println("Неправильно ввели номер телефона");
        }

        System.out.println("Введите вашу почту: ");
        String emailInput = scr.nextLine();
        boolean res = emailInput.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        if (res){
            System.out.println("Почта верна");
        }else {
            System.out.println("Не правильно ввели почту!");
        }
    }
}