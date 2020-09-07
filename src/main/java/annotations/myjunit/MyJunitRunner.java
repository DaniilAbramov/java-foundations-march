package annotations.myjunit;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class MyJunitRunner {
    @SneakyThrows
    public static void main(String[] args) {

        int passedTest = 0;
        int failedTest = 0;

        final Class<?> clazzJunitTest = Class.forName("annotations.myjunit.MyTest");
        Method[] methods = clazzJunitTest.getMethods();
        MyTest test = new MyTest();

        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(MyBeforeAll.class)) {
                    System.out.println(MyBeforeAll.say);
                }
            } catch (Throwable throwable) {
                System.err.println(method.getName());

            }
        }
        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(MyBefore.class)) {
                    System.out.println(MyBefore.say);
                }
            } catch (Throwable throwable) {
                System.err.println(method.getName() + " bez before");

            }
        }
        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(MyJunitTest.class)) {
                    method.invoke(test);
                    passedTest++;
                    System.out.println(method.getName() + " Успешно прошел");
                }
            } catch (Throwable throwable) {
                System.err.println(method.getName() + " Упал");
                failedTest++;
            }
        }
        System.out.println("_________\n Количество проведенных тестов : "
                + passedTest + "\n Количество упавших : " + failedTest);

        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(MyAfter.class)) {
                    System.out.println(MyAfter.say);
                }
            } catch (Throwable throwable) {
                System.err.println(method.getName() + " bez after");

            }
        }
        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(MyAfterAll.class)) {
                    System.out.println(MyAfterAll.say);
                }
            } catch (Throwable throwable) {
                System.err.println(method.getName() + " bez after");

            }
        }
    }
}
