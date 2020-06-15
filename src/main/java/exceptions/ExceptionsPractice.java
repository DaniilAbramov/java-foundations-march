package exceptions;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPractice {
    public static void main(String[] args) {
//        throw new RuntimeException("Hola, RuntimeException");

//        try {
//            throw new Exception("Hola, Exception");
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        try {
//            exceptionMethod();
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        exceptionMethodSneakyTrows();

//        try {
//            throw new FileNotFoundException();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (Exception e){
//            System.err.println("Exc");
//            e.printStackTrace();
//        }
        Child marusia = null;
        try {
            marusia = new Child("Maria", -10);
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println(marusia);

    }

    public static void exceptionMethod() throws Exception {
        throw new Exception("Hola, Exception");


    }

    @SneakyThrows
    public static void exceptionMethodSneakyTrows() {
        throw new Exception("Hola, Exception");
    }
}
