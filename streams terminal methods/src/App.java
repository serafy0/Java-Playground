import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        // Q) What happens?
        var stream = Stream.generate(() -> Math.random())
                .mapToInt(x -> (int) (4 * x))
                .filter(x -> x > 0)
                .allMatch(x -> x % 2 == 0);

        System.out.println(stream);
    }
}
