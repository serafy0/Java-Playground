package playground._21_reduction_operations_and_paralleism.parallel_stream_operation.quick_question.q1;

import java.util.stream.LongStream;

public class App {
    public static void main(String[] args) {
        long[] counter = { 0 };
        LongStream.range(0, 10_000_000_000L)
                .parallel().peek(x -> counter[0]++) // not thread safe
                .allMatch(x -> x >= 0);

        System.out.println(counter[0]);
    }
}
