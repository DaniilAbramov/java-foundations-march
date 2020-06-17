package exceptions.hw;

public class ExceptionHW  {
    public static void main(String[] args) {

//        throw new NullPointerException("Null");

        try {
            throw new IndexOutOfBoundsException("Null");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index");

        } finally {
            System.out.println("first finally");
        }

        try {
            exception();
        } catch (Exception e) {
            System.out.println("Catch");
        }finally {
            System.out.println("second finally");
        }
    }

    public static void exception() throws Exception{
        throw new Exception("Индекс");
    }
}
