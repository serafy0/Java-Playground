package playground._20_stream_fundamentals.steram_terminal_methods;

import java.util.Random;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        // Q) What happens?
        var stream = Stream.generate(() -> Math.random())
                .mapToInt(x -> (int) (4 * x))
                .filter(x -> x > 0)
                .allMatch(x -> x % 2 == 0);

        System.out.println(stream);

        // Q What happens? program hangs
        // new Random().doubles(-1.0,
        // +1.0).average().ifPresent(System.out::println);

        new Random().doubles(-1.0,
                +1.0).limit(100).average().ifPresent(System.out::println);
    }
}
