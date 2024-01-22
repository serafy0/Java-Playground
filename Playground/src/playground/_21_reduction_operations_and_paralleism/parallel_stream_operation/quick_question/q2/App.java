package playground._21_reduction_operations_and_paralleism.parallel_stream_operation.quick_question.q2;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        int[] counter = { 0 };
        boolean result = IntStream.range(0, 100_000_000)
                // .parallel()
                // .map(x -> x * 2)
                // .sequential()
                .peek(x -> counter[0]++)
                .allMatch(x -> true);
        System.out.println(counter[0]);
        System.out.println(result);
    }
}
