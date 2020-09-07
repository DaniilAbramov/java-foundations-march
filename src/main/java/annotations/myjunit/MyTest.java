package annotations.myjunit;

public class MyTest {
    @MyBeforeAll
    public void method1() {
        throw new RuntimeException("method 1");
    }

    @MyBefore
    public void method6() {
        throw new RuntimeException("method666");
    }

    @MyJunitTest
    public static void method2() throws Exception {
        throw new Exception("Method2");

    }

    @MyJunitTest
    public static void method3() {

    }

    @MyJunitTest
    public static void method8() throws Exception {
        throw new Exception("Method2.3");
    }

    @MyJunitTest
    public static void method5() {

    }

    @MyAfter
    public static void method7() throws Exception {
        throw new Exception("Method2.1");
    }

    @MyAfterAll
    public static void method4() {

    }
}
