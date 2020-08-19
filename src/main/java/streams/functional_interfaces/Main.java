package streams.functional_interfaces;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i < 0;

        System.out.println("predicate.test(5) = " + predicate.test(5));
        System.out.println("predicate.test(5) = " + predicate.test(-4));
        System.out.println("predicate.test(5) = " + predicate.test(0));

        Supplier<String> stringSupplier = () -> "Ola";

        System.out.println("stringSupplier.get() = " + stringSupplier.get());

        //Consumer

        Consumer<Integer> stringConsumer = i -> System.out.println("i =" + i);
        stringConsumer.accept(5);

        FuncInterface funcInterface = s -> System.out.println(s);

        funcInterface.hello("HELLO");

        //Function ДЗ

        Integer integer = 5;
        Optional.ofNullable(integer).ifPresent(System.out::println);

        Integer intFromOptional = Optional.ofNullable(integer).orElse(6);

        System.out.println(intFromOptional);

        Optional<Integer> optionalInteger = Optional.ofNullable(integer);
        System.out.println("optionalInteger.get() = " + optionalInteger.get());

    }
}
