package streams.HW;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class HWStreams {
    @SneakyThrows
    public static void main(String[] args) {

        // Iterate
        Stream.iterate(1, n -> n + 1)
                .limit(6)
                .forEach(System.out::print);

        //sum
        long result = LongStream.range(2, 4)
                .sum();

        //reduce
        int SumNumbers = Stream.of(1, 2, 3, 4, 5)
                .reduce(10, Integer::sum);

        System.out.println();

        // flatMap
        Stream.of(10, 0, 6, 4, 2)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::print);

        System.out.println();

        // Exrs. 2
        File file = new File("src/main/resources/fileNotebook.txt");

        Files.lines(Paths.get(file.getAbsolutePath()))
                .forEach(System.out::println);
    }
}
