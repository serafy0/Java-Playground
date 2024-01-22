package playground._21_reduction_operations_and_paralleism.parallel_stream_operation.quick_question.q3;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .parallel()
                .forEachOrdered(System.out::println);
        System.out.println();
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallelStream()
                .forEachOrdered(System.out::println);

    }
}
