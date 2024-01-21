import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        // Q) create a stream of the numbers 1, 3, 5, 7 ... up to 1000?
        var output = IntStream.iterate(1, v -> v < 1000, v -> v + 2).boxed().toList();
        var output2 = IntStream.iterate(1, v -> v + 2).limit(500).boxed().toList();
        var output3 = IntStream.rangeClosed(1, 999).filter(v -> v % 2 != 0).boxed().toList();
        var output4 = IntStream.rangeClosed(1, 999).filter(v -> v % 2 != 0).boxed().toList();
        var output5 = IntStream.range(0, 500).map(v -> v * 2 + 1).boxed().toList();

        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.print("--1--");
            } else if (i > 1 && i < 5) {
                System.out.printf("---%d--", i);
            } else if (i == 5) {
                System.out.printf("---%d-- \n", i);
            }
        }

        for (int i = 0; i < 500; i++) {

            System.out.printf("%3d | ", output.get(i));
            System.out.printf("%3d | ", output2.get(i));
            System.out.printf("%3d | ", output3.get(i));
            System.out.printf("%3d | ", output4.get(i));
            System.out.printf("%3d |\n", output5.get(i));
        }
    }
}
