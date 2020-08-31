package annotations.myjunit;

public class MyTest {
    @MyBefore
    @MyJunitTest
    public void method1() {
        throw new RuntimeException("method 1");

    }

    @MyJunitTest
    public static void method2() throws Exception {
        throw new Exception("Method2");
    }

    @MyJunitTest
    public static void method3() {

    }
    @MyBefore
    @MyJunitTest
    public static void method4() {

    }
    @MyBefore
    @MyJunitTest
    public static void method5() {

    }
    @MyBefore
    @MyJunitTest
    public void method6() {
        throw new RuntimeException("method666");
    }
}
