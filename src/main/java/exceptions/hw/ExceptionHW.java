package exceptions.hw;

import exceptions.Child;
import exceptions.MyException;

public class ExceptionHW  {
    public static void main(String[] args) {

//        throw new NullPointerException("Null");

//        try {
//            throw new IndexOutOfBoundsException("индекс");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("index");
//
//        } finally {
//            System.out.println("first finally");
//        }
//
//        try {
//            exception();
//        } catch (Exception e) {
//            System.out.println("Catch");
//        }finally {
//            System.out.println("second finally");
//        }

        try {
            Child tema = new Child("Tema",111);
        } catch (MyException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Third finally");
        }
    }

    public static void exception() throws Exception{
        throw new Exception("Индекс");
    }
}
